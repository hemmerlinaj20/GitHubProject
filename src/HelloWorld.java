import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("Give me your name.");
        Scanner scnr = new Scanner(System.in);
        String name = scnr.next();

        System.out.println("Your name is: " + name);

    }
}
