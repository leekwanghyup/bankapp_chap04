package section04.sample01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomServiceMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section04/sample01_context.xml");
		
		// 싱글턴빈 CustomRequestService가 프로토타입빈 CustomRequestDetails 의존
		CustomRequestService bean1 = context.getBean(CustomRequestService.class);
		System.out.println(bean1.getCustomRequestDao());
		System.out.println(bean1.getCustomRequestDetails()); 
		
		CustomRequestService bean2 = context.getBean(CustomRequestService.class);
		System.out.println(bean2.getCustomRequestDao());
		System.out.println(bean2.getCustomRequestDetails()); // bean1이 참조하는 빈과 동일함 
		
		System.out.println("===============================================");
	
		// 프로토타입 스코프빈은 요청할 때 생성되고 매 요청마다 다른 객체가 생성된다. 
		TestBean testBean1 = context.getBean(TestBean.class);
		System.out.println(testBean1);
		TestBean testBean2 =context.getBean(TestBean.class);
		System.out.println(testBean2);
		
		
	}
}
