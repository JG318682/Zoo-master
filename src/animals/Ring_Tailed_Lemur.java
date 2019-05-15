package animals;

import types.Primate;

public class Ring_Tailed_Lemur extends Primate
{
    private String age;

    public Ring_Tailed_Lemur()
    {
        super("animals.Ring Tailed Lemur", "Reminds you of King Julian, he was very cool");
        this.age = "very young";
    }

    @Override
    public String makeNoise()
    {
        return "I Like To Move It Move It";
    }
}
