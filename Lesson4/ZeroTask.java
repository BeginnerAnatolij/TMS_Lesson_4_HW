package Lesson4;

public class ZeroTask {
    public static void main(String[] args) {
        String name = "5535-ABC-6832-lan-1a2b";
        StringBuilder nameO = new StringBuilder("5532-abc-6832-lan-1a2b");
        try {
            MethodsForZeroTask.checkTheBeginning(name);
        } catch (WrongStartOfTheDocument e1) {
            System.out.println(e1.getMessage());
        }
        try {
            MethodsForZeroTask.checkTheEnding(name);
        } catch (NotEndsWith1a2b e3) {
            System.out.println(e3.getMessage());
        }
        try {
            MethodsForZeroTask.sequenceOfLetters(name);
        } catch (NotSequenceOfAbc e2) {
            System.out.println(e2.getMessage());
        }
        MethodsForZeroTask.TwoBlocksOfIntergers(name);
        MethodsForZeroTask.replaceThreeLetters(nameO);
        MethodsForZeroTask.lettersInLowRegister(name);
        StringBuilder two = new StringBuilder("5552-abc-6832-lan-1a2b");
        MethodsForZeroTask.lettersInUpperCase(two);
    }
}
