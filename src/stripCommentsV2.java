


public class stripCommentsV2 {
    public static String stripComments(String text, String[] commentSymbols) {

        while (containsSymbol(text, commentSymbols)) {
            int indexNewline = text.indexOf("\n", indexSymbol(text, commentSymbols));
            String comment = text.substring(indexSymbol(text, commentSymbols), indexNewline);
            text.replace(comment, "");

        }

        return text;
    }






    public static boolean containsSymbol(String text, String[] symbols) {
        for (int k = 0; k < symbols.length; k++) if (text.contains(symbols[k])) return true;
        return false;
    }

    public static int indexSymbol(String text, String[] symbols) {
        int index = 0;
        char[] array = text.toCharArray();
        for (char ch : array) {
            if (isSymbol(ch, symbols)) return index;
            index++;
        }
        return -1;
    }

    public static boolean isSymbol(char c, String[] commentSymbols) {
        for (String symbol : commentSymbols) if (symbol.equals(c)) return true;
        return false;
    }


}
