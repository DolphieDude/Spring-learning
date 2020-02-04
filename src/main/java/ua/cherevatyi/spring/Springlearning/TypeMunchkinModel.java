package ua.cherevatyi.spring.Springlearning;

public class TypeMunchkinModel {
    private TypeMunchkinCard card;

    public TypeMunchkinModel(TypeMunchkinCard card) {
        this.card = card;
    }

    void wearCard() {
        System.out.println("Wore " + this.card.getCard());
    }
}
