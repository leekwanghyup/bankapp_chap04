package section04.sample02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class RegisterMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section04/sample02_context.xml");
		RegisterationService bean1 = context.getBean(RegisterationService.class);
		RegisterationService bean2 = context.getBean(RegisterationService.class);
		
		bean1.registerService();
		
		System.out.println("================================================");
		
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1.getRegisterationDetails());
		System.out.println(bean2.getRegisterationDetails());
		
	}
}
