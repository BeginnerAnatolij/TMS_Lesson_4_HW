package Lesson4;

public class SecondTask {
    public static void main(String[] args) {
      SecondTask.wordWithMinDiffSymbols("f fgt jjii jkk hn jil  ");
    }

    public static void wordWithMinDiffSymbols(String name) {
        int count = 0;
        String result = "";
        String[] array = name.split(" ");
        for (String word : array) {
            int diffSymbols = 0;
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) != word.charAt(i + 1)) {
                    diffSymbols++;
                }
            }
            if (diffSymbols<count ) {
                count = diffSymbols;
                result = word;
                break;
            }

            }
        System.out.println(result);
        }
    }
