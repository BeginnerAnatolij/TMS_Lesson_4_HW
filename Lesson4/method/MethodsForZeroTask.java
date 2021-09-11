package Lesson4.method;

import Lesson4.exception.NotEndsWith1a2b;
import Lesson4.exception.NotSequenceOfAbc;
import Lesson4.exception.WrongStartOfTheDocument;

public class MethodsForZeroTask {
    /*
    Methods for checking and modifying document number
     */
    public static void checkTheBeginning(String str) throws WrongStartOfTheDocument {

        if (!str.startsWith("555"))
            throw new WrongStartOfTheDocument("Документ не начинается с 555");
        else {
            System.out.println("Документ начинается с 555");
        }
    } //checking whether a string starts with 55

    public static void checkTheEnding(String str) throws NotEndsWith1a2b {
        if (!str.endsWith("1a2b"))
            throw new NotEndsWith1a2b("Не заканчивается на 1a2b");
        else {
            System.out.println("Заканчивается на 1a2b");
        }
    }//checking whether a string ends with 1a2b

    public static void sequenceOfLetters(String str) throws NotSequenceOfAbc {
        if (!str.toLowerCase().contains("abc")) {
            throw new NotSequenceOfAbc("Номер документа не содержит последовательность abc");
        } else {
            System.out.println("Номер документа содержит последовательность abc");
        }
    }//checking whether a string contains sequence of letters abc

    public static void TwoBlocksOfIntergers(String str) {
        System.out.println(str.substring(0, 4) + str.substring(9, 13));
    } // printing two blocks of integers

    public static void replaceThreeLetters(StringBuilder str) {
        System.out.println(str.replace(5, 8, "").replace(12, 15, ""));
    } // replacing two blocks of 3 letters to space

    public static void lettersInLowRegister(String str) {
        System.out.println(str.toLowerCase().substring(5, 8) + '\\' + str.toLowerCase().substring(14, 17)
                + '\\' + str.toLowerCase().substring(19, 20) + '\\' + str.toLowerCase().substring(21, 22));
    }//printing only letters in low register from a string in a format xxx\xxx\x\x

    public static void lettersInUpperCase(StringBuilder str) {
        System.out.println("Letters: " + str.substring(5, 8).toUpperCase() + '\\' + str.substring(14, 17).toUpperCase()
                + '\\' + str.substring(19, 20).toUpperCase() + '\\' + str.substring(21, 22).toUpperCase());
    }//printing only letters in upper register from a string in a format xxx\xxx\x\x using string builder
}

