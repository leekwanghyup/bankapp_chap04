package bankapp_chap04.section03.simple01;

import org.springframework.context.support.GenericXmlApplicationContext;

import bankapp_chap04.section02.sample02.SomeBean;

public class BankApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section03/sample-context01.xml");
		EventSenderService bean = context.getBean(EventSenderService.class);
	}
}
