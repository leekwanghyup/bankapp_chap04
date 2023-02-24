## 4.1 소개
    내부빈(inner bean)
    bean엘리먼트 depends-on 속성
    자동연결(autowiring)

<br>

## 4.2 내부빈 
```java
package bankapp_chap04.section02.sample01;

public class FixedDepositDao {
	
	public void createDeposit() {
		System.out.println("FixedDepositDao : createDeposit()");
	}
}

@Setter
public class FixedDepositService {
	
	private FixedDepositDao fixedDepositDao;
	
	public void submit() {
		fixedDepositDao.createDeposit();
	}
}

public class BankApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section02/sample-context01.xml");
		context.getBean(FixedDepositService.class).submit();
	}
}

```
    FixedDepositService 의존하는 빈이 FixedDepositDao빈뿐인 경우 
    FixedDepositDao빈을 FixedDepositService빈의 내부빈으로 정의할 수 있다.

```xml
<!-- section02/sample-context01.xml -->
<bean id="fixedDepositService" class="bankapp_chap04.section02.sample01.FixedDepositService">
    <property name="fixedDepositDao">
        <bean class="bankapp_chap04.section02.sample01.FixedDepositDao"/>	
    </property>
</bean>
```