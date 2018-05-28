package org.xwt.designPatterns.createPatterns.abstractFactoryPattern;
/**
 * 抽象工厂模式的启动类
 * 		抽象工厂模式的优点：1、调用者想要创建一个对象，只要知道名称就可以了
 * 					2、屏蔽对象创建细节，调用者只关心对象的接口
 * 					3、扩展性高，增加一个产品，只需要扩展一个工厂类就可以了
 * 				缺点：每次增加一个产品，都要增加一个具体类和对象实现工厂，增加了系统的复杂度和代码的耦合度
 * 
 * @author thinkpad
 *
 */
public class Bootstrap {

	public static void main(String[] args) {
		Server server0 = new ServerFactory().createServer(0);
		Server server1 = new ServerFactory().createServer(1);
		Server server2 = new ServerFactory().createServer(2);
		
		server0.start();
		server1.start();
		server2.start();
		
		Client client0 = new ClientFactory().createClient(0);
		Client client1 = new ClientFactory().createClient(1);
		Client client2 = new ClientFactory().createClient(2);
		
		client0.start();
		client1.start();
		client2.start();
	}
	
}
