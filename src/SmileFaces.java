import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {

        int smileyCount = 0;

         for (String str : arr) {
             if (mouthPosition(str) - 1 == eyesPosition(str) || mouthPosition(str) - 2 == eyesPosition(str)
                     && eyesPosition(str) != -1 && mouthPosition(str) != -1) smileyCount++;
         }

         return smileyCount;
    }


    public static int eyesPosition(String s) {
        if (s.indexOf(':') != -1) return s.indexOf(':');
        if (s.indexOf(';') != -1) return s.indexOf(';');
        return -1;
    }


    public static int mouthPosition(String s) {
        if (s.indexOf(')') != -1) return s.indexOf(')');
        if (s.indexOf('D') != -1) return s.indexOf('D');
        return -1;
    }

}
