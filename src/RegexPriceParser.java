import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPriceParser {
    public static Integer toCents(String price){
        int index = 0;
        String regex = "\\$\\d+\\.\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(price);
        if (m.find()) return Integer.parseInt(price.replaceAll("[.](^[\\d]^[\\d])", ""));
        return null;
    }



}


// Integer.parseInt(price.replaceAll("[.](^\\d{2})", ""));