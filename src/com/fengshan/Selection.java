package com.fengshan;

public class Selection {
	public static void sort(int[] a){
		int n=a.length;
		for(int i=0;i<n;i++){
			int min=i;  //最小元素的索引
			for(int j=i+1;j<n;j++){
				if(a[min]>a[j])
					min=j;
			}
			int exch;
			exch=a[min];
			a[min]=a[i];
			a[i]=exch;
		}
	}
	public static void main(String [] args){
		int [] sort={4,3,5,6,77,44,88};
		sort(sort);
		for (int i : sort) {
			System.out.println(i);
		}
		
	}
}
