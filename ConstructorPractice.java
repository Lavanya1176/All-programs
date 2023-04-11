import org.w3c.dom.NameList;

public class ConstructorPractice {

    String name;
    int marks;
    public ConstructorPractice(String nm){
        this(nm,2000);
    }
    public ConstructorPractice(){
        this("Sample",1000);
    }
    public ConstructorPractice(String nm, int mrk){
        this.name=nm;
        this.marks=mrk;
        System.out.println("Constrctor created.");
    }

    public void display()
    {
        System.out.println("This is my name "+this.name+"  and my marks :"+this.marks);
    }
    public static void main(String[] args) {
        
        ConstructorPractice obj = new ConstructorPractice("Manish");

        System.out.println(obj.name+" "+obj.marks);
        obj.display();
    }
}
