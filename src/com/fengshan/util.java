package com.fengshan;
//排序工具类
public class util {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean less(Comparable a,Comparable b){
		return a.compareTo(b)<0;
	}
	
	@SuppressWarnings("rawtypes")
	public static void exch(Comparable [] a,int i,int j){
		Comparable t=a[i];a[i]=a[j];a[j]=t;
	}
	
	@SuppressWarnings("rawtypes")
	public static void show(Comparable[] a){
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean isSorted(Comparable[] a){
		for(int i=0;i<a.length;i++)
			if(less(a[i],a[i+1]))
				return false;
		return true;				
	}
}
