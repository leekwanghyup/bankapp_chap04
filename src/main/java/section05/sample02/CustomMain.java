package section05.sample02;

import org.springframework.context.support.GenericXmlApplicationContext;

// lookup-method 엘리먼트 
public class CustomMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section05/sample02_context.xml");
		
		CustomService bean1 = context.getBean(CustomService.class);
		CustomService bean2 = context.getBean(CustomService.class);
		CustomService bean3 = context.getBean(CustomService.class);
		System.out.println("============================================================");
		bean1.submitDetails();
		bean2.submitDetails();
		bean3.submitDetails();
	}
}
/*
	 CustomService : 싱글턴빈
	 CustomDetails : 프로토타입 빈
	 CustomDao : 싱글턴 빈
	 의존관계 : CustomService -> CustomDetails, CustomDao
*/
