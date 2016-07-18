package com.sort;

public class Quick {
	
	public static void main(String[] args){
		int[] a={2,43,5,4,87,5,9,0,23,16,78,54,98,3578,34,856456,84546};
		sort(a);
		show(a);
	}
	
	public static void sort(int[] a){
		int n=a.length-1;
		sort(a,0,n);
	}
	
	public static void sort(int [] a,int lo,int hi){
		if(hi<=lo) return;
		int k=partition(a, lo, hi);
		sort(a,lo,k-1);
		sort(a,k+1,hi);
		
	}
	
	public static int partition(int [] a,int lo,int hi){
		int i=lo,j=hi+1;
		int k=a[lo];
		while(true){
			while(less(a[++i],k))    if(i==hi) break;
			while(less(k,a[--j]))	 if(j==lo) break;
			if(i>=j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
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
