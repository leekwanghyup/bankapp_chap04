package bankapp_chap04.section02.sample01;

import org.springframework.context.support.GenericXmlApplicationContext;

// 내부빈 정의
public class BankApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section02/sample-context01.xml");
		context.getBean(FixedDepositService.class).submit();
	}
}
