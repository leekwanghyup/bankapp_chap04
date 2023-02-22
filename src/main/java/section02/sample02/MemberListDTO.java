package section02.sample02;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MemberListDTO {
	
	private List<MemberVO> memberList;
	
	public void info() {
		memberList.stream().forEach(m-> System.out.println(m));
	}
}
