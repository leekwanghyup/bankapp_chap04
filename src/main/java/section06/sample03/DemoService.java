package section06.sample03;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DemoService {
	private DemoDetails demoDetails;
	private DemoDao demoDao;
	
	public DemoService() {
		System.out.println("Create DemoService");
	}
}
