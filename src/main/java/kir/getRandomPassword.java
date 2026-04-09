package kir;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class getRandomPassword {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int lengthOfPassword;
    char[]chars = {
            '1','2','3','4','5','6','7','8','9','0',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '#',
            '!', '@', '&', '*', '^', '%', '$', '~'
    };
    public String password = String.valueOf(chars[random.nextInt(0, chars.length)]);
    void getPassword(){
        System.out.println("Введите длинну пароля: ");
        try {
            lengthOfPassword = input.nextInt();
            if (lengthOfPassword <= 0){
                System.out.println("Введите пожалуйста число больше нуля ):");
                return;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка!\nВы ввели не цифры!");
        }
        for (int i = 0; i < lengthOfPassword; i++) {
            password += chars[random.nextInt(0, chars.length)];
        }
        System.out.println(password);
    }
}
