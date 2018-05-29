package org.xwt.designPatterns.createPatterns.builderPattern;

public class NetB implements Item{

	@Override
	public String name() {
		return "流量B";
	}

	@Override
	public Unit unit() {
		return new NetUnit();
	}

	@Override
	public int count() {
		return 4;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 20.0f;
	}
	
	

}
