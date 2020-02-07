package ua.cherevatyi.spring.Springlearning;

import org.springframework.stereotype.Component;

@Component("anno")
public class RaceCard implements TypeMunchkinCard {
    @Override
    public void doInit() {
        System.out.println("new Race is here");
    }

    @Override
    public void doDestroy() {
        System.out.println("Race is folded");
    }

    @Override
    public String getCard() {
        return "Elf";
    }
}
