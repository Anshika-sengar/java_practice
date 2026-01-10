package oops.polymmorphism;

class compileTime {
    String name;
    long rollNumber;
    String address;
    public void printDetails(String name){
        System.out.println(name);
    }
    public void printDetails(int rollNumber){
        System.out.println(rollNumber);

    }
    public void printDetails(String name,long rollNumber,String address){
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(address);

    }
}
public class compileTimeMethodOverloading  {
    public static void main(String[] args) {
        compileTime s1 =new compileTime();
        s1.name="anshika";
        s1.rollNumber=240164014003L;
        s1.address="kanpur";
        s1.printDetails(s1.name,s1.rollNumber,s1.address);
        

    }
}
