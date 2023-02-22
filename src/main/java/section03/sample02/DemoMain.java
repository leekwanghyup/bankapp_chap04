package section03.sample02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("section03/sample02_context.xml");
	}
}
