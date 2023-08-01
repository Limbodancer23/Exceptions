package Task1;
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your number!");
        Float n;
        while (true) {
            try {
                n = getNumber();
                if (n != null) break;
            }catch (InputMismatchException e){
                System.out.println("Enter correct number!");
            }
        }
        System.out.printf("Your number correct! " + n);
    }

    private static Float getNumber() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
