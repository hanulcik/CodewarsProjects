public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {

        StringBuilder sb = new StringBuilder();
        int lastSymbol = 0;

        char[] charArr = new char[text.length()];

        for (char ch : charArr) {
            if (isSymbol(ch, commentSymbols)) {
                lastSymbol = charArr[ch];
                continue;
            }
            String current = text.substring(lastSymbol, -1);
            int newLine = current.indexOf("/n");
            if (charArr[ch] > lastSymbol && charArr[ch] < newLine) continue;
            sb.append(ch);
        }
        return sb.toString();
    }




    /**
     * Given a character and a string arrayt of symbols, return if the char is a given symbol.
     * Returns 1 if a match, 0 if not.
     * @param ch
     * @param commentSymbols
     * @return
     */
    public static boolean isSymbol(char ch, String[] commentSymbols) {
        for (String symbol : commentSymbols) {
            if (symbol.equals(ch)) return true;
        }
        return false;
    }



}
