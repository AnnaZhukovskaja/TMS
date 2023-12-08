package Task3;

public class MaxDiff {

    public static int searchDiffLet(String str) {
        StringBuilder strWithoutSameLet = new StringBuilder();
        String currentElement;
        for (int i = 0; i < str.length(); i++) {
            currentElement = String.valueOf(str.charAt(i));
            if (strWithoutSameLet.indexOf(currentElement) < 0) {
                strWithoutSameLet.append(currentElement);
            }
        }
        return strWithoutSameLet.length();
    }

    public static void searchDiffWords(String text) {

        String[] textArray = text.split(" ");
        String wordWithMaxDiffLet = textArray[0];

        for (int i = 0; i < textArray.length; i++) {
            if (searchDiffLet(textArray[i]) < searchDiffLet(wordWithMaxDiffLet)) {
                wordWithMaxDiffLet = textArray[i];
            }
        }
        System.out.println("Word is " + wordWithMaxDiffLet);
    }
}
