package section06.sample03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context =
			new GenericXmlApplicationContext("classpath:section06/sample03_context.xml");
		
		DemoService bean1 = context.getBean(DemoService.class);
		DemoService bean2 = context.getBean(DemoService.class);
		
		System.out.println(bean1.getDemoDao());
		System.out.println(bean1.getDemoDetails());
		
		System.out.println("=========================================================");
		
		System.out.println(bean2.getDemoDao());
		System.out.println(bean2.getDemoDetails());
	}
}
