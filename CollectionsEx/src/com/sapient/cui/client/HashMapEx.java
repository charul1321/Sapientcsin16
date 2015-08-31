package com.sapient.cui.client;

import java.util.*;
import java.util.Iterator;

class Data1
{
	private int value;

	Data1(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}
}

public class HashMapEx {
	public static void main(String[] args) {
		
		HashMap<Integer, Data1> result = new HashMap<Integer, Data1>();
		result.put(3, new Data1(32));
		result.put(5, new Data1(12));
		result.put(3, new Data1(7));
		result.put(3, new Data1(42));
		System.out.println(result);
		// while(iterator.hasNext())
		// {
		// data=iterator.next();
		// System.out.println(data);
		// }

	}
}
