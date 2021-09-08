package Lesson4;


import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        /*
        Cheking whether a word in a sentence is palidrom
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String sentence = scanner.nextLine();
        System.out.println("Введите номер слова для проверки. Номера слов начинаются с 0");
        int numberOfWord = scanner.nextInt();
        String[] array = sentence.split(" ");
        try {
            for (int i = 1; i < array.length; i++) {
                StringBuilder str = new StringBuilder(array[numberOfWord]).reverse();
                String strRev = str.toString();
                if (strRev.equalsIgnoreCase(array[numberOfWord])) {
                    System.out.println(array[numberOfWord] + "-это слово палиндром");
                } else {
                    System.out.println(array[numberOfWord] + "-это не  палиндром");
                }
                break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого номера слова");
        }
    }
}





