package lr5;

import java.util.Scanner;

class IntFunction {
    int argument, result;
    IntFunction() {
        argument = 3;
        result = argument * argument;
    }

    IntFunction(int argument) {
        this.argument = argument;
        result = this.argument * this.argument;
    }

    IntFunction(int argument, int result) {
        this.argument = argument;
        this.result = result;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int argument, result;

        System.out.println("Input argument of function (int number):");
        while (!in.hasNextInt()) {
            System.out.println("That's not a number!");
            in.next();
        }
        argument = in.nextInt();

        System.out.println("Input result of function (int number):");
        while (!in.hasNextInt()) {
            System.out.println("That's not a number!");
            in.next();
        }
        result = in.nextInt();

        IntFunction defaultFunction = new IntFunction();
        IntFunction argumentFunction = new IntFunction(argument);
        IntFunction argumentAndResultFunction = new IntFunction(argument, result);

        System.out.printf("Instance of IntFunction with default argument and result. Argument: %d, result: %d\n",
                defaultFunction.argument,
                defaultFunction.result);
        System.out.printf("Instance of IntFunction with entered argument and default result. Argument: %d, result: %d\n",
                argumentFunction.argument,
                argumentFunction.result);
        System.out.printf("Instance of IntFunction with entered argument and result. Argument: %d, result: %d\n",
                argumentAndResultFunction.argument,
                argumentAndResultFunction.result);

        in.close();
    }
}
