package org.xwt.designPatterns.createPatterns.SingtlePattern;

public class Singtle {
	
private String var;
	
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	public static Singtle getSingtle() {
		return singtle;
	}
	public static void setSingtle(Singtle singtle) {
		Singtle.singtle = singtle;
	}
	private Singtle(){
		this.var = "懒汉1";
	}
	
	private static Singtle singtle;
	
	
	/**
	 * 懒汉模式1
	 * 		延迟加载
	 * 		线程不安全
	 * @return
	 */
	public static Singtle getInstanse1(){
		if(singtle == null){
			singtle = new Singtle();
		}
		return singtle;
	}
	/**
	 * 懒汉模式2
	 * 		延迟加载
	 * 		线程安全
	 * 		每次访问都要获得（等待）锁，效率低
	 * @return
	 */
	public static Singtle getInstanse2(){
		synchronized (Singtle.class) {
			if(singtle == null){
				singtle = new Singtle();
			}
			return singtle;
		}
	}
	/**
	 * 双重校验锁
	 * 		延迟加载
	 * 		线程安全
	 * 		只有第一次需要等待锁
	 * 		反序列化后不能保证单例
	 * @return
	 */
	public static Singtle getInstanse3(){
			if(singtle == null){
				synchronized (Singtle.class) {
					if(singtle == null){
						singtle = new Singtle();
					}
				}
			}
			return singtle;
		
	}
	
	/**
	 * 饿汉模式
	 * 		非延迟加载，可能存在内存浪费
	 * 		利用类加载机制实现线程安全
	 * 		效率高
	 */
	static{
		singtle = new Singtle();
	}
	public static Singtle getInstanse4(){
		return singtle;
	
	}
	/**
	 * 静态内部类
	 * 		延迟加载
	 * 		线程安全
	 * 		效率高
	 * 		反序列化可能存在非单例
	 * @author thinkpad
	 *
	 */
	private static class SingleHandler{
		private static final Singtle singtle;
		static{
			singtle = new Singtle();
		}
	}
	public static Singtle getInstanse5(){
		return SingleHandler.singtle;
	
	}

	/**
	 * 通过枚举实现
	 * 		非延迟加载
	 * 		线程安全
	 * 		支持序列化机制
	 * @author thinkpad
	 *
	 */
	enum SingleEnum{
		INSTANCE;
		private String var;
		private SingleEnum(){
			var = "balabala";
		}
		public String getVar(){
			return this.var;
		}
	}
	void invokeSingleEnum(){
		SingleEnum.INSTANCE.getVar();
	}
	
	
}
