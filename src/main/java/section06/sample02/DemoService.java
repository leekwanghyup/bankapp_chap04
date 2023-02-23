package section06.sample02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class DemoService {
	private DemoDetails demoDetails;
	private DemoDao demodeDemoDao;
	
	public DemoService() {
		System.out.println("Create DemoService");
	}
}
