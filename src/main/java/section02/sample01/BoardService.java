package section02.sample01;

import lombok.Setter;

@Setter
public class BoardService {
	
	private BoardDao boardDao;
	
	public void list() {
		System.out.println("BoardService : list");
		boardDao.list();
	}
}
