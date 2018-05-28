package org.xwt.designPatterns.createPatterns.abstractFactoryPattern;

public abstract class AbstractFactory {

	public abstract Server createServer(int type);
	
	public abstract Client createClient(int type);
	
}
