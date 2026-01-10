package oops;
class Student{
    String name;
    long rollNumber;
    String address;
    public void printDetails(){
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(address);

    }
    // Student(){ // default constructor
    //     this.name="Anshika";
    //     this.address="kanpur";
    //     this.rollNumber=24016401400L;

    // }

    // Student(String name,long rollNumber,String address){ // parametrized constructor
    //     this.name=name;
    //     this.address=address;
    //     this.rollNumber=rollNumber;

    // }
    
    Student(Student s2){ // copy constructor
        this.name=s2.name;
        this.address=s2.address;
        this.rollNumber=s2.rollNumber;

    }
    Student(){} // default constructor is needed to run the copy constructor because it is not created automatically when we use copy constructor
    

}
public class studentclass {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="aman";
        s1.address="kanpur";
        s1.rollNumber=24016401400L;
        Student s2 =new Student(s1);
        s2.printDetails();

    }
}
