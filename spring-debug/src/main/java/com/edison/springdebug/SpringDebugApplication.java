package com.edison.springdebug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 源码学习入口类
 * 通过 ClassPathXmlApplicationContext 手动加载 XML 配置，
 * 以便断点跟踪 refresh() 方法的执行流程。
 */
public class SpringDebugApplication {

	public static void main(String[] args) {
		// 创建基于 XML 的 Spring 容器，构造函数内部会自动调用 refresh()
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// 从容器中获取 Bean 并调用
		HelloService helloService = ctx.getBean(HelloService.class);
		helloService.sayHello();

		// 关闭容器，释放资源
		ctx.close();
	}

}
