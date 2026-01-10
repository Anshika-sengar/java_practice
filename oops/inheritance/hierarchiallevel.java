package oops.inheritance;
class shape {
    public void display(){
        System.out.println("class shape");
    }
}
class Tree extends shape{
    public void display1(){
        System.out.println("class tree");
    }
}
class Book extends shape{
    public void display2(){
        System.out.println("class book");
    }
}
public class hierarchiallevel {
    public static void main(String[] args) {
        Book b = new Book();
        Tree t =new Tree();
        t.display();
        t.display1();
        b.display();
        // b.display1(); //gives error
        b.display2();
    }
}
