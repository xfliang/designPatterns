package org.xwt.designPatterns.createPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Combo {

	private String name;
	private List<Item> list = new ArrayList<Item>();
	
	public void addItem(Item item){
		list.add(item);
	}

	public Combo(String name) {
		this.name = name;
	}
	
	public float price(){
		float sum = 0 ;
		for(Item item : list){
			sum += item.price();
		}
		return sum;
	}
	
	public void show(){
		System.out.println("套餐："+name);
		for(Item item : list){
			System.out.println("\t"+item.name()+":"+item.unit().unit()+"="+item.count()+item.unit().show());
		}
		System.out.println("\t"+"套餐价格："+price());
		
	}
}
