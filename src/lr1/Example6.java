package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String lastname, firstname, middlename;
        System.out.println("Input your lastname: ");
        lastname = in.nextLine();

        System.out.println("Input your firstname: ");
        firstname = in.nextLine();

        System.out.println("Input your middlename: ");
        middlename = in.nextLine();

        System.out.printf("Hello, %s %s %s", lastname, firstname, middlename);
        in.close();
    }
}
