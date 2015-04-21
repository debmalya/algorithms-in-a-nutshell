package com.erj.practice.searching;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashBasedSearch implements Searchable {

	@Override
	public boolean search(int target, int[] field) {
		ArrayList<LinkedList<Integer>> hashTable = loadTable(field);
		int hashIndex = target % ((int)Math.sqrt(field.length) + 1);
		LinkedList<Integer> list = hashTable.get(hashIndex);
		if(list == null || list.size()==0){
			return false;
		}
		return list.contains(target);
	}

	private ArrayList<LinkedList<Integer>> loadTable(int[] field) {
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		int resultSize = (int)Math.sqrt(field.length) + 1;
		for(int i = 0; i<field.length; i++){
			int hashIndex = field[i] % resultSize;
			try{
				result.get(hashIndex);
			}catch(Exception e){
				result.add(hashIndex, new LinkedList<Integer>());
			}
			
			result.get(hashIndex).add(field[i]);
		}
		return result;
	}

}
