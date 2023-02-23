package section05.sample02;

import lombok.Setter;

// 싱글턴 빈
public abstract class CustomService{
	
	@Setter
	private CustomDao customDao;
	
	public CustomService() {
		System.out.println("Create CustomService Bean");
	}
	
	public abstract CustomDetails getCustomDetails();
	
	public void submitDetails() {
		System.out.println(getCustomDetails());
	}
}
