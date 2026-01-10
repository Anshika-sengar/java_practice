package oops.inheritance;
class A1{
    int a;
    int b;
    public void add1(){
        a=9;
        b=7;
    }
}
class B1 extends A1{
    public void print(){
        System.out.println(a+b);
    }
}
public class singlelevel {
    public static void main(String[] args) {
        B1 s1=new B1();
        s1.add1();
        s1.print();
    }
}
