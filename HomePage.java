package BANKING.src;
public class HomePage{
class details{
    String Name;
    int Account;
    int Available_amount;
    public details(String N, int acc, int amt){
    this.Name=N;
    this.Account=acc;
    this.Available_amount=amt; 
    }
    public int Deposite(){
        this.Available_amount+=1000;
        return this.Available_amount;

    }
}
    
    public static void main(String[] args) {
        HomePage hp=new HomePage();
    HomePage.details user1=hp.new details("lavanya", 101, 35000);
    System.out.println(user1.Deposite());
    }

}

//OuterClass.StaticNestedClass nestedObject =new OuterClass.StaticNestedClass();
//OuterClass.InnerClass innerObject = outerObject.new InnerClass();