package oops.encapsulation; // correct comments

class Account {
   public String name;
   //  public: accessible from anywhere (same package + outside package)

   protected String email;
   //  protected: accessible within the same package
   //  also accessible outside the package ONLY in subclass (inheritance)

   String city;
   //  default (no modifier): also called package-private
   //  accessible only within the same package
   //  not accessible outside the package (even by subclass)

   private String password;
   //  private: accessible only inside the same class
   // to access it outside, we use getter and setter methods

   public void setPassword(String password) {
       this.password = password;
   }

   public String getPassword() {
       return password;
    }
    public void print(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(city);
        System.out.println(password);
    }
}

public class modifier {
   public static void main(String args[]) {
       Account a1 = new Account();

       a1.name = "Anshika";           //  public
       a1.email = "hello@.com"; //  protected (same package)
       a1.city = "Kanpur";                 //  default (same package)
       a1.setPassword("abcd");             //  private (using setter)
       a1.print();
   }
}
