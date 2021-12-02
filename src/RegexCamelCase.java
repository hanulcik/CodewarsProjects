import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCamelCase {
    public static String camelCase(String str){
        String regex = "\\s([a-z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        str = str.replaceAll(regex, " " +m.group(1).toUpperCase());

        str = str.replaceAll("\\s", "");
        return str;
    }
}
