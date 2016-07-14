package com.sort;
/**
 * 改良的插入排序
 * @author wangjie
 *
 */
public class ImproveInsertion {
	public static void main(String [] args){
		int [] a={4,23,3,35,1,3,45,6,6,6574};
		sort(a);
		show(a);
	}
	public static void sort(int[] a){
		int n=a.length;
		for(int i=1;i<n;i++){
			int num=a[i];
			int j=-1;
			while(j<i&&less(a[++j],a[i]));		//找到所要插得位置
			for(int k=i;k>j;k--){				//
				a[k]=a[k-1];
			}
			a[j]=num;
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
