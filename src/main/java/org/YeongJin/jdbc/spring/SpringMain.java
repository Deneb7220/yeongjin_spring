package org.YeongJin.jdbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * p.46 [����Ʈ 2.5]�� p.50 [����Ʈ 2.6] Main Ŭ���� ������  
 * 
 * @author Jacob
 */
public class SpringMain {

	public static void main(String[] args) {
		// Ŭ���� �н����� chap02.xml ������ �о ���ؽ�Ʈ �ʱ�ȭ
		// ctx ���� chap02.xml���� ������ ��� ����� ����ִ�.
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		g1.greet();

		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		g2.greet();

		System.out.println(g1 == g2);
	}
}