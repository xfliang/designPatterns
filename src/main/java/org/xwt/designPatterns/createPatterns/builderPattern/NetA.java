package org.xwt.designPatterns.createPatterns.builderPattern;

public class NetA implements Item{

	@Override
	public String name() {
		return "流量A";
	}

	@Override
	public Unit unit() {
		return new NetUnit();
	}

	@Override
	public int count() {
		return 2;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 10.0f;
	}
	
	

}
