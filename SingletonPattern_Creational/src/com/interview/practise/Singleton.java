package com.interview.practise;

public class Singleton {
	private static volatile Singleton instance; // Volatile Need to add to read directly from main memory.
	private String data;

	private Singleton(String data) { // private constructor
		this.data = data;
	}

	private static Singleton getInstance(String data) {
        Singleton result = instance; // Assigned to reduce db call.
		if (result == null) { // double-check locking Mechanism/ Idiom
			synchronized (Singleton.class) { // To prevent multiple thread access
				result = instance;
				if (result == null) {
					instance = result = new Singleton(data);
				}
			}
		}
		return result;
	}

}
