package section05.sample01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section05/sample01_context.xml");
		CustomService bean1 = context.getBean(CustomService.class);
		CustomService bean2 = context.getBean(CustomService.class);
		CustomService bean3 = context.getBean(CustomService.class);
		
		System.out.println("============================================================");
		
		bean1.submitDetails();
		bean2.submitDetails();
		bean3.submitDetails();
	}
}
