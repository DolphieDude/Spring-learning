package ua.cherevatyi.spring.Springlearning;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
@Setter
public class TypeMunchkinModel {
    private List<TypeMunchkinCard> cards;
    private boolean isSupermunchkin;

    public TypeMunchkinModel(List<TypeMunchkinCard> cards) {
        this.cards = cards;
    }

    public TypeMunchkinModel() {
        this.cards = new ArrayList<>();
    }

    boolean isSupermunchkin() {
        return isSupermunchkin;
    }

//    @Autowired
//    @Qualifier("classCard")
//    void addCard(TypeMunchkinCard card) {
//        this.cards.add(card);
//    }

    void wearCard() {
        this.cards.forEach(c -> System.out.println("Wore " + c.getCard()));
    }
}
