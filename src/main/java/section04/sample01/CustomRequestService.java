package section04.sample01;

import lombok.Getter;

@Getter
public class CustomRequestService {
	
	private CustomRequestDao customRequestDao; 
	private CustomRequestDetails customRequestDetails;

	public CustomRequestService(CustomRequestDao customRequestDao, CustomRequestDetails customRequestDetails) {
		this.customRequestDao = customRequestDao;
		this.customRequestDetails = customRequestDetails;
	}
}
