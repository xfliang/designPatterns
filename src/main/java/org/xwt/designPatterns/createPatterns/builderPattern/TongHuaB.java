package org.xwt.designPatterns.createPatterns.builderPattern;

public class TongHuaB implements Item{

	@Override
	public String name() {
		return "通话B";
	}

	@Override
	public Unit unit() {
		return new TongHuaUnit();
	}

	@Override
	public int count() {
		return 200;
	}

	@Override
	public float price() {
		return 40.0f;
	}

}
