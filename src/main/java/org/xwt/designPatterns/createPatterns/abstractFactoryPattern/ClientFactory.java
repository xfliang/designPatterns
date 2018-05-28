package org.xwt.designPatterns.createPatterns.abstractFactoryPattern;

public class ClientFactory extends AbstractFactory{

	@Override
	public Server createServer(int type) {
		return null;
	}

	@Override
	public Client createClient(int type) {
		if(type == 0){
			return new BioClient();
		}else if(1 == type){
			return new NioClient();
		}else if (2 == type){
			return new AioClient();
		}else{
			throw new RuntimeException("no such client type:"+type);
		}
	}

}
