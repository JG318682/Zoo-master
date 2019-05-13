package animals;

import types.Primate;

/**
 * Write a description of class animals.Chimpanzee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chimpanzee extends Primate
{
    private String age;

    public Chimpanzee()
    {
        super("animals.Chimpanzee", "brown and sometimes mean");
        this.age = "very young";
    }

    @Override
        public String makeNoise()
    {
        return "screeches and throws feces.";
    }
}