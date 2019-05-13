package main;

public abstract class Animal
{
    private String name;
    private String desc;
    
    public Animal(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
    }

    public String getEat(){
        return eat();
    }

    public String getName() {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public abstract String eat();
    public abstract String makeNoise();

}




