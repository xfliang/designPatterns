package org.xwt.designPatterns.createPatterns.protoTypePattern;
/**
 * 原型模式
 * 		注意深克隆与浅克隆
 * 		浅克隆：被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象
 * 		深克隆：被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。
 * 			     那些引用其他对象的变量将指向被复制过的新对象，而不再是原有的那些被引用的对象
 * 		Object的clone()方法是浅克隆
 * @author thinkpad
 *
 */
public class Bootstrap {

	
	public static void main(String[] args) {
		EntryPool.loadEntry();
		System.out.println(EntryPool.entry.toString());
		Entry e1 = EntryPool.getEntry();
		e1.setProperty(2, "B", new Son(22, "bb"));
		System.out.println(e1.toString());
		System.out.println(EntryPool.entry.toString());
	}
	
}
