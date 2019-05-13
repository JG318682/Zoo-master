package types;

import animal_Qualities.Swimming;
import main.Animal;

public class Reptile extends Animal implements Swimming {

    public Reptile()
    {
        super("types.Reptile", "a lot of reptile types");

    }
    public Reptile(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Hissing and snapping sound";
    }
    public String eat()
    {
        return "Deer meat";
    }
    public String swim() {return "can walk but mostly swims";}
}
