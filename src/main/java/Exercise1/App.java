package Exercise1;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String name = myApp.readName();
        String outputString = myApp.generateOutputString(name);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readName() {
        System.out.print("What is your name? ");
        return in.nextLine();
    }

    public String generateOutputString(String name){
        return String.format("Hello, %s, nice to meet you!", name);
    }
}
