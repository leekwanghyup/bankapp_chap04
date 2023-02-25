## 4.1 소개
    내부빈(inner bean)
    bean엘리먼트 depends-on 속성
    자동연결(autowiring)

<br>

## 4.2 내부빈 
	빈 의존 관계를 여러빈이 공유하지 않는다면 의존관계를 내부빈으로 만들 것을 고려할 수 있다.
	내부빈은 property나 constructor-arg엘리먼트 내부에 정의한 빈을 뜻한다.
	내부분은 해당 내부빈 정의를 둘러싼 빈 정의안에서만 접근가능하다.
```java
package bankapp_chap04.section02.sample01;

public class FixedDepositDao {
	
	public void createDeposit() {
		System.out.println("FixedDepositDao : createDeposit()");
	}
}

// FixedDepositService는 FixedDepositDao에 의존함
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
	내부빈 정의에 해당하는 beans엘리먼트는 id,scope속성을 지정하지 않는다.
	id,scope속성을 지정한다고하더라도 스프링컨테이너는 이를 무시한다.

```xml
<bean id="fixedDepositService" class="bankapp_chap04.section02.sample01.FixedDepositService">
    <property name="fixedDepositDao">
        <bean class="bankapp_chap04.section02.sample01.FixedDepositDao"/>	
    </property>
</bean>
```

<br>

	스프링 util스키마엘리먼트를 property,constructor-art엘리먼터 내에서 사용할 수 있다.
```java
package bankapp_chap04.section02.sample02;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SomeBean {
	private List<String> listType;
}

//내부분이에서 util스키마 list 엘리먼트 사용
public class someMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:section02/sample-context02.xml");
		SomeBean bean = context.getBean(SomeBean.class);
		System.out.println(bean.getListType());
	}
}
```
```xml
<!-- 내부분이에서 util스키마 list 엘리먼트 사용 -->
<bean id="someBean" class="bankapp_chap04.section02.sample02.SomeBean">
	<constructor-arg name="listType">
		<util:list list-class="java.util.ArrayList">
			<value>A simple String value in list</value>
			<value>Another simple String value in list</value>
		</util:list>
	</constructor-arg>
</bean>
<!-- util:list 엘리먼트의 id속성은 무시되므로 지정하지 않았다. -->
```

<br>

## 4.3 depends-on 속성을 통해 빈 초기화 순서 제어하기 
	빈 생성 순서는 XML 파일에 빈이 정의된 순서를 따른다. 
	빈 사이에 의존관계가 있다면 의존대상의 빈이 먼저 생성된다. 
	지금까지는 빈 정의에 의해 빈의 의존관계가 명시적으로 나타나 있는 것을 살펴봤다.
	빈 의존 관계가 암시적인 경우에 depends-on속성을 활용해 빈 생성순서를 제어할 수 있다. 

### 4.3.1 빈 사이의 암시적 의존관계

