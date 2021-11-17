import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPriceParser {
    public static Integer toCents(String price){
        String regex = "\\$\\d+\\.\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(price);
        if (m.find()) return m.start();
        return null;
    }
}
