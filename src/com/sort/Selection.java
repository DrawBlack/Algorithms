package com.sort;
/**
 * 选择排序
 * @author WangJie
 *
 */
public class Selection {
	public static void sort(int[] a){
		int n=a.length;
		for(int i=0;i<n;i++){
			int min=i;  				//最小元素的索引
			for(int j=i+1;j<n;j++){
				if(less(a[j],a[min]))
					min=j;
			}
			exch(a,i,min);
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
	
	//测试
	public static void main(String [] args){
		int [] unsorted={4,3,5,6,77,44,88};
		sort(unsorted);
		show(unsorted);
	}
}
