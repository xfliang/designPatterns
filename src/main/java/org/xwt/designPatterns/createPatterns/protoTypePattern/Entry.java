package org.xwt.designPatterns.createPatterns.protoTypePattern;

public class Entry implements Cloneable{

	private int id;
	private String name;
	private Son son;
	
	public Entry(){
		System.out.println("初始化对象，将会耗时较长。。。");
		this.id = 1;
		this.name = "A";
		Son son = new Son(11, "aa");
		this.son = son;
	}
	
	public void setProperty(int id,String name,Son son){
		System.out.println("设置属性:");
		this.id =id;
		this.name = "A";
		this.son = son;
	}
	
	public Entry clone(){
		Entry clone = null;
		try {
			clone = (Entry)super.clone();
			
			//添加子类克隆实现深克隆
			clone.son = son.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return  clone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Son getSon() {
		return son;
	}

	public void setSon(Son son) {
		this.son = son;
	}

	@Override
	public String toString() {
		return "Entry [id=" + id + ", name=" + name + ", son=" + son.toString() + "]";
	}
	
	
	
}
