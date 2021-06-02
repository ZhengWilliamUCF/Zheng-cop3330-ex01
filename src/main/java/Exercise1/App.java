package Exercise1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // Concat
        String outputString = "Hello, " + name + ", nice to meet you!";

        // Output
        System.out.println(outputString);
    }

}
