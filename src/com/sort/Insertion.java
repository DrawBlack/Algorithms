package com.sort;
/**
 * 插入排序
 * 
 * 分析：对于随机排列的长度为N且主键不重复的数组，平均情况下插入排序需要 ~N^2/4次比较以及 ~N^2/4次交换。
 *      最坏情况下需要 N^2/2次比较和N^2/2次交换，最好情况下需要N-1次比较和0次交换。
 * @author WangJie
 *      要大幅提高插入排序算法并补办，只需要在内循环中将较大的元素都向右移动而不是总交换两个元素（这样访问数组的次数能减半）。
 *      有兴趣可以查看
 */
public class Insertion {
	public static void sort(int[] a){
		int n=a.length;
		for(int i=1;i<n;i++)
			for(int j=i;j>0 && less(a[j],a[j-1]);j--){
				exch(a, j, j-1);
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
		int [] a={23,3,35,1,3,45,6,6,6574,3};
		sort(a);
		show(a);
	}
}
