package animals;

import types.Equine;

/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Equine
{
    private String age;

    public Zebra()
    {
        super("animals.Zebra", "Has stripes of black and white");
        this.age = "A young stud";
    }

    @Override
    public String makeNoise()
    {
        return "Neighs and makes donkey noises to";
    }
}
