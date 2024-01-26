package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.WishMessageGenerator;

public class ConstructorSetterInjection {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/in/ineuron/cfg/applicationContext.xml");
		System.out.println("Bean count is " + classPathXmlApplicationContext.getBeanDefinitionCount());
		System.out.println("Bean id is " + Arrays.toString(classPathXmlApplicationContext.getBeanDefinitionNames()));
		
		WishMessageGenerator wmg = classPathXmlApplicationContext.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
		classPathXmlApplicationContext.close();
		
	}
}
