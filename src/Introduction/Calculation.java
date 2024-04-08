package Introduction;

public class Calculation {
    public static void main(String[] args) {

        int u = 20;
        int a = 10;
        int t = 30;
        int s = 50;
        int v = 35;

        //first equation
        int InitialDisplacement =(u*t) + (1/2)*a*(t*t);
        System.out.println("the initial displacement is" + " " + InitialDisplacement) ;

        //second equation
        int InitialVelocity = u + (a*t);
        System.out.println("the initial velocity is" + " " + InitialVelocity);

        //third equation
        int FinalDisplacement = (v*t) - (1/2)*a*(t*t);
        System.out.println("the final displacement is" + " " + FinalDisplacement);

        //fourth equation
        int FinalVelocity =(int) Math.sqrt((u*u) + (2*a*s));
        System.out.println("the final velocity is" + " " + FinalVelocity);


        int farenheit = 98;
        int celsius = (farenheit - 32) * 5/9;
        System.out.println(farenheit + " " + "degrees" + " " + "converted to celsius is" + " " + celsius + " " + "degrees");
    }

}
