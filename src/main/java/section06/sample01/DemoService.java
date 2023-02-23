package section06.sample01;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DemoService {
	private DemoDetails demoDetails;
	private DemoDao demodeDemoDao;
	
	public DemoService() {
		System.out.println("Create DemoService");
	}
}
