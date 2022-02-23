import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Give me your name.");
        String name = scnr.next();
        while (name.equals("Bill")){
            name = scnr.next();
        }

    }
}
