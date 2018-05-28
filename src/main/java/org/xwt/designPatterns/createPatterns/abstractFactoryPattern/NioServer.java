package org.xwt.designPatterns.createPatterns.abstractFactoryPattern;

public class NioServer implements Server{

	@Override
	public void start() {
		System.out.println("NioServer start");
	}

}
