package animalkingdom;

public class Birds extends AbstractAnimals{
    //constructor
     //every child of abstract class needs a constructor 

     public Birds(String name, int year){
        super(); //parent class
        this.name = name;
        this.year = year;
    }


    @Override
    public String move(){
        return "fly";
    }

    @Override
    public String breathe(){
        return "lungs";
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