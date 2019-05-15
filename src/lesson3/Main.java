package lesson3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String hiddenString = guessingWords();
        System.out.println("Я загадал слово, попробуйте его отгадать)");
//        System.out.println(hiddenString);
        Scanner scanner = new Scanner(System.in);
        do {
            String inputString = scanner.next();
            if (inputString.equals(hiddenString)) {
                System.out.println("Мои поздравления, вы угадали)");
                scanner.close();
                break;
            } else {
                equalStr(inputString, hiddenString);
                System.out.println();
                System.out.println("Попробуйте еще раз");
            }
        } while (true);
    }

    public static String guessingWords() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int finalValue = 25;
        int randomNumber = (int) (Math.random() * finalValue);
        return words[randomNumber];
    }

    public static void equalStr(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                System.out.print(s1.charAt(i));
            } else {
                System.out.print("*");
            }


        }
        for (int i = minLen; i < 20; i++) {
            System.out.print("*");
        }

    }

}
