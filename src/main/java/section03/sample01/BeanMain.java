package section03.sample01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("section01/sample03_context.xml");
		
	}
}
