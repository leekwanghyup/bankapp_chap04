package bankapp_chap04.section02.sample01;

import lombok.Setter;

@Setter
public class FixedDepositService {
	
	private FixedDepositDao fixedDepositDao;
	
	public void submit() {
		fixedDepositDao.createDeposit();
	}
}
