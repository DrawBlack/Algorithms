package com.sort;

public class ImproveInsertion {
	
	public static void sort(int[] a){
		int n=a.length;
		for(int i=1;i<n;i++)
			for(int j=i;j>=0 && less(a[i],a[j]);j--){
				for(int k=i;k>j;k--)		//把较大的元素向右移
					a[k]=a[k-1];
				a[j]=a[i];
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
	
	public static void main(String [] args){
		int [] a={23,3,35,1,3,45,6,6,6574};
		sort(a);
		show(a);
	}

}
