package org.xwt.designPatterns.createPatterns.builderPattern;

public class ComboBuilder {

	public static Combo comboA(){
		Combo combo = new Combo("套餐A");
		combo.addItem(new TongHuaA());
		combo.addItem(new NetA());
		return combo;
	}
	
	public static Combo comboB(){
		Combo combo = new Combo("套餐B");
		combo.addItem(new TongHuaB());
		combo.addItem(new NetB());
		return combo;
	}
	
}
