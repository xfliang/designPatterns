package org.xwt.designPatterns.createPatterns.abstractFactoryPattern;


public class ServerFactory extends AbstractFactory{

	@Override
	public Server createServer(int type) {
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

	@Override
	public Client createClient(int type) {
		return null;
	}

}
