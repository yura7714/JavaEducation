package timus;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class task2002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final String ACTIVE_STATUS = "active";
        final String INACTIVE_STATUS = "inactive";

        int n = in.nextInt();
        HashMap<String, String> userPasswords = new HashMap<>();
        HashMap<String, String> userStatuses = new HashMap<>();

        in.nextLine();

        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
            String[] inputArr = input.split(" ");

            String login = "";
            String password = "";

            if (inputArr.length > 1) {
                login = inputArr[1];
            }

            if (inputArr.length > 2) {
                password = inputArr[2];
            }

            switch (inputArr[0]) {
                case "register":
                    if (userPasswords.containsKey(login)) {
                        out.println("fail: user already exists");
                        break;
                    }

                    userPasswords.put(login, password);
                    out.println("success: new user added");
                    break;
                case "login":
                    if (!userPasswords.containsKey(login)) {
                        out.println("fail: no such user");
                        break;
                    }

                    if (!userPasswords.get(login).equals(password)) {
                        out.println("fail: incorrect password");
                        break;
                    }

                    if (userStatuses.containsKey(login) && userStatuses.get(login).equals(ACTIVE_STATUS)) {
                        out.println("fail: already logged in");
                        break;
                    }

                    userStatuses.put(login, ACTIVE_STATUS);
                    out.println("success: user logged in");
                    break;
                case "logout":
                    if (!userPasswords.containsKey(login)) {
                        out.println("fail: no such user");
                        break;
                    }

                    if (!userStatuses.containsKey(login) || userStatuses.get(login).equals(INACTIVE_STATUS)) {
                        out.println("fail: already logged out");
                        break;
                    }

                    userStatuses.put(login, INACTIVE_STATUS);
                    out.println("success: user logged out");
                    break;
            }
        }

        in.close();
        out.flush();
    }
}
