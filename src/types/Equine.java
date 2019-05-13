package types;

import animal_Qualities.Walking;
import main.Animal;

public class Equine extends Animal implements Walking
{
    public Equine()
    {
        super("types.Primate", "a lot of monkey types");
    }
    public Equine(String name, String desc)
        {
            super(name, desc);
        }
        public String makeNoise()
        {
            return "hoots";
        }
        public String eat()
        {
            return "bananas";
        }
        public String walk() {return "runs and walks";}
}
