package section04.sample02;

// 싱글톤
public class RegisterationDao {
	
	public RegisterationDao() {
		System.out.println("create RegisterationDao Bean");
	}
	
	public void register() {
		System.out.println("register Customer Deposit");
	}
}
