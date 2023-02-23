package section05.sample02;

// 싱글턴
public class CustomDao {
	
	public CustomDao() {
		System.out.println("Create CustomDao Bean");
	}

	public void insertDetails(CustomDetails customDetails) {
		System.out.println("데이터베이스 저장 : "+customDetails);
	}
}
