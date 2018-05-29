package org.xwt.designPatterns.createPatterns.builderPattern;

public class TongHuaA implements Item{

	@Override
	public String name() {
		return "通话A";
	}

	@Override
	public Unit unit() {
		return new TongHuaUnit();
	}

	@Override
	public int count() {
		return 100;
	}

	@Override
	public float price() {
		return 20.0f;
	}

}
