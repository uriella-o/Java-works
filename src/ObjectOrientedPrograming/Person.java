package ObjectOrientedPrograming;

public class Person {
    String Firstname;
    String lastname;
    String sex;
    String email;
    int age;

    public void hello(String Firstname){
        this.Firstname = Firstname;
        System.out.println(this.Firstname);
    }

}
