import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRemoveParenthesis {
    public static String removeParens(String str) {
        Pattern ptrn = Pattern.compile("\\(.*[^(]\\)");
        Matcher m = ptrn.matcher(str);
        while (m.find()) str = str.replace(m.group(), "");

        return str;
    }
}
