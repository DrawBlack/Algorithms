package com.fengshan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class NumberStatistics {
	public static void main(String [] args){
		Map<Integer, Integer> map=new HashMap<>();
		Random random=new Random(47);
		for(int i=0;i<100;i++){
			int j=random.nextInt(20);
			Integer r =map.get(j);
			map.put(j, r==null?1:r+1);
		}
//		System.out.println(map);
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){
			Integer key=(Integer) it.next();
			System.out.print(key+":"+map.get(key)+"   ");
		}
	    
		
	}
}
