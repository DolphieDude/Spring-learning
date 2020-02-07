package ua.cherevatyi.spring.Springlearning;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
//@RestController
public class SpringLearningApplication {
//	@RequestMapping("/")
//	private void spring() {
//		System.out.println("SPRING HI");
//	}
//
//	@RequestMapping("/hi")
//	private void sup() {
//		System.out.println("sup");
//	}

	public static void main(String[] args) {
//		SpringApplication.run(SpringLearningApplication.class, args);
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml"); //using Application Context
		TestBean newBean = appContext.getBean("myBean", TestBean.class);
//		TypeMunchkinCard card = appContext.getBean("card", TypeMunchkinCard.class);
		TypeMunchkinModel typeMunchkinCardUser = appContext.getBean("munchkinTypeCardModel", TypeMunchkinModel.class); //using dependency injection
		System.out.println(newBean.getId());
		typeMunchkinCardUser.wearCard();
		TypeMunchkinModel munchkinWithTypeSetter = appContext.getBean("munchkinWithTypeSetter", TypeMunchkinModel.class); //Setter Dependency Injection
		TypeMunchkinModel munchkinWithTypeSetter2 = appContext.getBean("munchkinWithTypeSetter", TypeMunchkinModel.class);
		List<TypeMunchkinCard> listCards = new ArrayList<>();
		listCards.add(appContext.getBean("race", TypeMunchkinCard.class));
		munchkinWithTypeSetter2.setCards(listCards);
		munchkinWithTypeSetter.wearCard();
		munchkinWithTypeSetter2.wearCard();
		System.out.println(munchkinWithTypeSetter.isSupermunchkin());
		System.out.println();
		System.out.println("____________________________");
		System.out.println();

		//____________________________

		TypeMunchkinCard cardInitDestroy = appContext.getBean("initAndDestroyTest", TypeMunchkinCard.class);
		System.out.println(cardInitDestroy.getCard());
		appContext.close(); //!!
		System.out.println();
		System.out.println("____________________________");
		System.out.println();

		//____________________________

		ClassPathXmlApplicationContext annoContext = new ClassPathXmlApplicationContext("AnnotationContext.xml");
		TypeMunchkinCard testAnnoRace = annoContext.getBean("anno", TypeMunchkinCard.class);
		System.out.println(testAnnoRace.getCard());
		TypeMunchkinCard testAnnoClass = annoContext.getBean("classCard", TypeMunchkinCard.class);
		System.out.println(testAnnoClass.getCard());
		annoContext.close();
	}
}
