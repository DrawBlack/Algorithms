package com.sort;
/**
 * 性能和希尔排序差不多
 * @author wangjie
 *
 */
public class Merge {
	
	private static int[] aux;				//归并排序所需要的辅助数组
	
	//测试
	public static void main(String[] args){
		int [] a={3,2,1,67,90,67,67543,676,23,89,46,345,34,34,678,23,43,89,183,5023};
		sort(a);
		show(a);
		
	}
	
	public static void sort(int[] a){
		aux=new int[a.length];				//一次性分配数组
		sort(a,0,a.length-1);
	}
	
	private static void sort(int[] a, int lo,int hi){
		if(lo>=hi) return ;
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);						//将左半边数组排序
		sort(a,mid+1,hi);						//将右半边数组排序
		merge(a,lo,mid,hi);					//归并结果
	}
	
	/**
	 * 
	 * 原地归并是把一个数组（前部分和后部分都是有序的）归并成一个有序数组。
	 */
	private static void merge(int[] a,int lo,int mid,int hi){
		int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++){
			aux[k]=a[k];
		}
		for(int k=lo;k<=hi;k++){
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(less(aux[j],aux[i])) a[k]=a[j++];
			else a[k]=aux[i++];
		}
		
	}
	
	public static boolean less(int a,int b){
		return a<b;
	}
	
	public static void exch(int [] a,int i,int j){
		int t=a[i];a[i]=a[j];a[j]=t;
	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	public static boolean isSorted(int[] a){
		for(int i=0;i<a.length;i++)
			if(less(a[i],a[i+1]))
				return false;
		return true;				
	}
}
