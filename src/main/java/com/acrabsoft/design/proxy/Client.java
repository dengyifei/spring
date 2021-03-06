package com.acrabsoft.design.proxy;

/**
 * 优点 ​ 1、 代理模式能够协调调用者和被调用者，在一定程度上降低了系统的耦合度。
 * 
 * ​ 2、 代理对象可以在客户端和目标对象之间起到中介的作用，这样起到了的作用和保护了目标对象的
 * 
 * 缺点 ​ 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 * 
 * ​ 2、 实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 * 
 * 五、 模式适用场景 ​ 1、 远程代理：为一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实。
 * 
 * ​ 2、 虚拟代理：通过使用过一个小的对象代理一个大对象。这样就可以减少系统的开销。
 * 
 * ​ 3、 保护代理：用来控制对真实对象的访问权限。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		BeautifulGirl girl = new BeautifulGirl();
		girl.setName("小红");

		GiveGift g = new HerChum(girl);
		g.giveFlowers();

	}
}
