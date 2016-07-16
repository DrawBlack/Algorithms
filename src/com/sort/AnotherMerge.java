package com.sort;

public class AnotherMerge {
	
	private static int[] aux;
	
	public static void main(String[] args){
		int[] a={2,43,5,4,87,5,9,0,23,16,78,54,98,3578,34,856456,84546};
		sort(a);
		show(a);
	}
	
	public static void sort(int [] a){
		int n=a.length;
		aux=new int[n];
		for(int size=1;size<n;size=size+size){
			for(int lo=0;lo+size<n;lo=lo+size+size){
				merge(a,lo,lo+size-1,Math.min(lo+size+size-1,n-1 ));
			}
		}
	}
	
	public static void merge(int[] a , int lo ,int mid,int hi){
		for(int i=lo;i<=hi;i++){
			aux[i]=a[i];
		}
		int i=lo,j=mid+1;
		for(int k=lo;k<=hi;k++){
			if(i>mid)							a[k]=aux[j++];
			else if(j>hi)						a[k]=aux[i++];
			else if(less(aux[i],aux[j]))		a[k]=aux[i++];
			else 								a[k]=aux[j++];
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
