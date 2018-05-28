package org.xwt.designPatterns.createPatterns.factoryPattern;

public class ServerFactory {

	
	static Server createServer(int type){
		if(0 == type){
			return new BioServer();
		}else if(1==type){
			return new NioServer();
		}else if(2 == type){
			return new AioServer();
		}else{
			throw new RuntimeException("no such type :"+type);
		}
	}
	
}
