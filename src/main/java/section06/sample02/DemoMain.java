package section06.sample02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context =
			new GenericXmlApplicationContext("classpath:section06/sample02_context.xml");
		
		DemoService bean1 = context.getBean(DemoService.class);
		DemoService bean2 = context.getBean(DemoService.class);
		
		System.out.println(bean1.getDemodeDemoDao());
		System.out.println(bean1.getDemoDetails());
		
		System.out.println("=========================================================");
		
		System.out.println(bean2.getDemodeDemoDao());
		System.out.println(bean2.getDemoDetails());
	}
}
