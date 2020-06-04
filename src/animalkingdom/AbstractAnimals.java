package animalkingdom;

abstract class AbstractAnimals{
    protected static int maxId = 0; //it's protected instead of private so children can know about it but no one else
    protected int year;
    protected String name; 
    protected int id; 

    public AbstractAnimals(){
        maxId++;
        this.id = maxId;
    }

    protected int getId(){
        return id;
    }

    abstract String getName();
    abstract int getYear(); 

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

    String eat(){             //there is no 'public' or 'private' because children will set this
        return "by mouth";
    }
}