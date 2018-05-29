package org.xwt.designPatterns.createPatterns.builderPattern;

public class TongHuaUnit implements Unit{

	@Override
	public String unit() {
		return "通话时长";
	}

	@Override
	public String show() {
		return "分钟";
	}

}
