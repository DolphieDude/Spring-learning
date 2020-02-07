package ua.cherevatyi.spring.Springlearning;

import org.springframework.stereotype.Component;

@Component
public class ClassCard implements TypeMunchkinCard {
    @Override
    public void doInit() {
        System.out.println("new Class is here");
    }

    @Override
    public void doDestroy() {
        System.out.println("Class is folded");
    }

    @Override
    public String getCard() {
        return "Warrior";
    }
}
