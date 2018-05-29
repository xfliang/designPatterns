package org.xwt.designPatterns.createPatterns.builderPattern;


public class NetUnit implements Unit{

	@Override
	public String unit() {
		return "流量";
	}

	@Override
	public String show() {
		return "G";
	}

}
