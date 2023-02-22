package section02.sample02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("section02/sample02_context.xml"); 
		MemberListDTO memberListDTO = context.getBean(MemberListDTO.class);
		memberListDTO.info();
	}
}
