package section04.sample02;

import lombok.Getter;

// 프로토타입
@Getter
public class RegisterationService {
	
	RegisterationDetails registerationDetails;
	RegisterationDao registerationDao;
	
	public RegisterationService(RegisterationDetails registerationDetails, RegisterationDao registerationDao) {
		this.registerationDetails = registerationDetails;
		this.registerationDao = registerationDao;
		System.out.println("Create RegisterationService bean");
	}
	
	public void registerService() {
		registerationDao.register();
	}
	
}
