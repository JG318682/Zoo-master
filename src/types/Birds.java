package types;

import animal_Qualities.Flying;
import main.Animal;

public class Birds extends Animal implements Flying {

    public Birds()
    {
        super("Bird", "a lot of bird types");

    }
    public Birds(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Squawks or tweets";
    }
    public String eat()
    {
        return "seeds and bugs";
    }
    public String fly() {return "can walk but mostly flies";}

}
