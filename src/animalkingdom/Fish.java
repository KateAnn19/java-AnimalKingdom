package animalkingdom;

public class Fish extends AbstractAnimals{

    //constructor - anything that needs to be instanced needs a constructor
    //every child of abstract class needs a constructor 

    public Fish(String name, int year){
        super(); //parent class
        this.name = name;
        this.year = year;
    }

    @Override
    public String move(){
        return "swim";
    }

    @Override
    public String breathe(){
        return "gills";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }

    //abstract methods from parent with functionality set here
    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return "Id: " + super.getId() + " Name: " + this.name + " Year: " + this.year + " Movement Type: " + move() + " Breathe: " + breathe() + " Reproduce: " + reproduce();
    }

    

}