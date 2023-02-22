package section05.sample01;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.Getter;
import lombok.Setter;

// 싱글턴 빈
public class CustomService implements ApplicationContextAware{
	
	@Setter
	private CustomDao customDao;
	
	private ApplicationContext applicationContext; 
	
	public CustomService() {
		System.out.println("Create CustomService Bean");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("call setApplicationContext method");
		this.applicationContext = applicationContext;
	}
	
	public void submitDetails() {
		CustomDetails customDetails = applicationContext .getBean(CustomDetails.class);
		customDao.insertDetails(customDetails);
	}
}
