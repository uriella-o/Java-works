package Introduction;

public class Aboutme {
    public static void main(String[] args) {
        String firstname = "Clare";
        String lastname = "Okafor";
        int age = 16;
        String color = "grey";
        String food = "chips";
        String hobby = "sleeping";
        int amount = 3000;
        int amount2 = 5000;

        System.out.println("My name is" +" "+ firstname + " "+ lastname);
        System.out.println("I am" + " " + age + " " +"years old.");
        System.out.println("My favourite color is " + " " + color);
        System.out.println("My favourite food is" + " " + food);
        System.out.println("My hobby is" + " " + hobby);
        System.out.println("My mom gave me" + " " + amount + "," + "but i already had" + " " + amount2);
        System.out.println("So now i have" + " " + (amount + amount2) + " " + "in total");
    }
}
