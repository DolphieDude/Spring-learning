package ua.cherevatyi.spring.Springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearningApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringLearningApplication.class, args);
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml"); //using Application Context
		TestBean newBean = appContext.getBean("myBean", TestBean.class);
//		TypeMunchkinCard card = appContext.getBean("card", TypeMunchkinCard.class);
		TypeMunchkinModel typeMunchkinCardUser = appContext.getBean("munchkinTypeCardModel", TypeMunchkinModel.class); //using dependency injection
		appContext.close();
		System.out.println(newBean.getId());
		typeMunchkinCardUser.wearCard();
	}
}
