package ua.cherevatyi.spring.Springlearning;

import lombok.Setter;

import java.util.List;

@Setter
public class TypeMunchkinModel {
    private List<TypeMunchkinCard> cards;
    private boolean isSupermunchkin;

    public TypeMunchkinModel(List<TypeMunchkinCard> cards) {
        this.cards = cards;
    }

    public TypeMunchkinModel() {
    }

    public boolean isSupermunchkin() {
        return isSupermunchkin;
    }

    void wearCard() {
        this.cards.forEach(c -> System.out.println("Wore " + c.getCard()));
    }
}
