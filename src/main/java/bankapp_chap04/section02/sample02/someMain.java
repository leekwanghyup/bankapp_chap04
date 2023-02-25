package bankapp_chap04.section02.sample02;

import org.springframework.context.support.GenericXmlApplicationContext;

//내부분이에서 util스키마 list 엘리먼트 사용
public class someMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section02/sample-context02.xml");
		SomeBean bean = context.getBean(SomeBean.class);
		System.out.println(bean.getListType());
	}
}
