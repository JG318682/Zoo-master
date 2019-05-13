package animals;

import types.Primate;

/**
 * Write a description of class animals.Orangutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orangutan extends Primate
{
    private String age;

    public Orangutan()
    {
        super("animals.Orangutan", "long hair and is mostly nice");
        this.age = "Crusty Old";
    }

    @Override
    public String makeNoise()
    {
        return "Lots of oooing";
    }
}
