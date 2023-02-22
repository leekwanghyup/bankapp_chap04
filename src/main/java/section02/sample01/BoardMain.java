package section02.sample01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
					new GenericXmlApplicationContext("section02/sample01_context.xml"); 
		BoardService service = context.getBean(BoardService.class);
		service.list();
	}
}
