package Lesson4.method;

public class FirstTask {
    public static void main(String[] args) {
        ShortestAndLongestWords("пойду поработаю я чуть-чуть ааааааааааааааааааа");
    }

    public static void ShortestAndLongestWords(String sentence) {
        /*
    Method which finds and prints the longest and the shortest words in the sentence
     */
        String[] array = sentence.split(" ");
        String longestWord = array[0];
        String shorterstWord = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= longestWord.length()) {
                longestWord = array[i];
            }
            if (array[i].length() <= shorterstWord.length()) {
                shorterstWord = array[i];
            }
        }
        System.out.println("Самое короткое слово: " + shorterstWord);
        System.out.println("Саоме длинное слово : " + longestWord);
    }
}
