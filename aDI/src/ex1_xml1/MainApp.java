package ex1_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 0. 기존자바방식(POJO)
		/*
		 * MessageBean bean = new MessageBeanKoImpl(); 
		 * bean.sayHello("홍길동"); 
		 * MessageBean bean2 = new MessageBeanEnImpl(); 
		 * bean2.sayHello("Jone");
		 */
		
		//-------------------------
		// [1] 스프링 설정 파일 연결
		ApplicationContext context = new
				ClassPathXmlApplicationContext(
						"ex1_xml1/applicationContext.xml");
		
		// [2] DI - 스프링 컨테이너에서 빈 가져오기
		MessageBean bean = (MessageBean)context.getBean("ko");
		bean.sayHello("홍길숙");
		
		MessageBean bean2 = (MessageBean)context.getBean("ko");
		bean2.sayHello("홍길동");
		
		MessageBean b1 = (MessageBean)context.getBean("en");
		b1.sayHello("Smith");
		
		MessageBean b2 = (MessageBean)context.getBean("en");
		b2.sayHello("Jane");
		
	}

}
