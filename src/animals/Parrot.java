package animals;

import types.Birds;

public class Parrot extends Birds
{
    private String age;

    public Parrot()
    {
        super("animals.Parrot", "Cute but slightly annoying at the same time");
        this.age = "Somewhat old";
    }

    @Override
    public String makeNoise()
    {
        return "Squaw";
    }
}
