package com.sort;
/**
 * 希尔排序：对于n个待排序的数列，取一个小于n的整数gap(gap被称为步长)将待排序元素分成若干个组子序列，
 * 所有距离为gap的倍数的记录放在同一个组中；然后，对各组内的元素进行直接插入排序。 这一趟排序完成之后，
 * 每一个组的元素都是有序的。然后减小gap的值，并重复执行上述的分组和排序。重复这样的操作，当gap=1时，整个数列就是有序的。


 * 
 * 
 * @author wangjie
 *
 */
public class Shell {
	
	public static void main(String[] args){
		int[] a={34,43,4343,4,334,34,33,54,546,37,4235,25,21,523,73,567,3456,3456,735,34,356,4,3436,73769,265347,456345,};
		sort(a);
		show(a);
	}
	public static void sort(int[] a){
		int n=a.length;
		int h=1;
		while(h<n/3) h=3*h+1;		//1,4,13,40,121,364,1093
		while(h>=1){
			//将数组变成h有序
			for(int i=h;i<n;i++){
				//讲a[i]插入到a[i-h],a[i-2*h],a[i-3*h].....之中
				for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
					exch(a, j, j-h);
			}
			h=h/3;
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
