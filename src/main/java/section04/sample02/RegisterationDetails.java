package section04.sample02;

import lombok.Getter;
import lombok.Setter;

//프로토타입
@Setter
@Getter
public class RegisterationDetails {
	private String accountNumber; 
	private String address; 
	private String cardNumber;
	
	public RegisterationDetails() {
		System.out.println("create RegisterationDetails bean");
	}
}
