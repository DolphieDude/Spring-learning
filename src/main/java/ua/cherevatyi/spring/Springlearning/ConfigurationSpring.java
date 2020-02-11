package ua.cherevatyi.spring.Springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("ua.cherevatyi.spring.Springlearning")
@PropertySource("application.properties")
public class ConfigurationSpring {
    @Bean
    public ClassCard card() {
        return new ClassCard();
    }

    @Bean
    public ClassCard classC() {
        return new ClassCard();
    }

    @Bean
    public RaceCard race() {
        return new RaceCard();
    }

    @Bean
    public List<TypeMunchkinCard> cards() {
        List<TypeMunchkinCard> cards = new ArrayList<>();
        cards.add(card());
        cards.add(classC());
        cards.add(race());
        return cards;
    }

    @Bean
    public TypeMunchkinModel munchkinTypeCardModel() {
        return new TypeMunchkinModel(cards());
    }

    @Bean
    @Value("Andrew")
    public TestBean myBean(String id) {
        return new TestBean(id);
    }

    @Bean
    @Scope("prototype")
    @Value("${TypeMunchkinModel.isSupermunchkin}")
    public TypeMunchkinModel munchkinWithTypeSetter(boolean isSupermunchkin) {
        TypeMunchkinModel munchkinTypeWithTypeSetter = new TypeMunchkinModel();
        munchkinTypeWithTypeSetter.setCards(cards());
        munchkinTypeWithTypeSetter.setSupermunchkin(isSupermunchkin);
        return munchkinTypeWithTypeSetter;
    }

    @Bean
    public ClassCard initAndDestroyTest() {
        ClassCard initAndDestroyTest = new ClassCard();
        initAndDestroyTest.doInit();
        return initAndDestroyTest;
        // Destroy???
    }
}
