package oops.inheritance;
class A{
    int a;
    int b;
    public void add(){
        a=9;
        b=7;
    }
}
class B extends A{
    public void print(){
        System.out.println(a+b);
    }
}
public class singlelevel {
    public static void main(String[] args) {
        B s1=new B();
        s1.add();
        s1.print();
    }
}
