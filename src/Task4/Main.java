package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String str = getString("Enter your Message: ");
            if (str.length() == 0) System.out.println("Can`t read empty string...");
        }catch (Exception e){
            System.out.println("Something else...");
        }
    }

    private static String getString(String string) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println(string);
        String str = scanner.nextLine();
        return str;
    }
}
