package org.xwt.designPatterns.createPatterns.protoTypePattern;

public class EntryPool {

	 static Entry entry;
	
	public static void loadEntry(){
		entry = new Entry();
	}
	
	public static Entry getEntry(){
		return entry.clone();
	}
	
	
	
}
