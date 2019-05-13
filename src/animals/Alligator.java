package animals;

import types.Reptile;

/**
 * Write a description of class animals.Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Reptile
{
    private String age;

    public Alligator()
    {
        super("animals.Alligator", "Has lots of teeth and nice jaw line");
        this.age = "Crusty Old";
    }

    @Override
    public String eat(){
        return "Eats deer meat";
    }
    public String makeNoise()
    {
        return "Lots of oooing";
    }
    
}
