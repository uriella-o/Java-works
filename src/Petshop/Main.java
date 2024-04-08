package Petshop;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setname("Roald");
        System.out.println("The dog's name is " + dog1.getname());
        dog1.setbreed("Rotwieller");
        System.out.println("The dog breed is " + dog1.getbreed());
        dog1.setAge(12);
        System.out.println("The dog is " + dog1.getAge());
        dog1.setSex("Male");
        System.out.println("The dog is " + dog1.getSex());
    }
}
