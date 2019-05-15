package animals;

import types.Primate;


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