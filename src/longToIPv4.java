/**
 * A function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.
 * 2149583361 ==> "128.32.10.1"
 * 32         ==> "0.0.0.32"
 */

//author: Avery Hanulcik
//date: 01 NOV 2021


public class longToIPv4 {
    public static String longtToIP(long ip) {
        String str = Long.toBinaryString(ip);

        if (str.length() <= 8) {
            Integer oct4 = Integer.parseInt(str);
            return "0.0.0." + oct4;
        }

        if (str.length() <= 16) {
            Integer oct3 = Integer.parseInt(str.substring(0,8), 2);
            Integer oct4 = Integer.parseInt(str.substring(8,str.length()-1), 2);
            return "0.0." + oct3 + "." + oct4;
        }

        if (str.length() <= 24) {
            Integer oct2 = Integer.parseInt(str.substring(0,8), 2);
            Integer oct3 = Integer.parseInt(str.substring(8,16), 2);
            Integer oct4 = Integer.parseInt(str.substring(16,str.length()-1), 2);
            return "0." + oct2 + "." + oct3 + "." + oct4;
        }

        if (str.length() < 32) {
            Integer oct1 = Integer.parseInt(str.substring(0,8), 2);
            Integer oct2 = Integer.parseInt(str.substring(8,16), 2);
            Integer oct3 = Integer.parseInt(str.substring(16,24), 2);
            Integer oct4 = Integer.parseInt(str.substring(24,str.length()-1), 2);
            return oct1 + "." + oct2 + "." + oct3 + "." + oct4;
        }

        Integer oct1 = Integer.parseInt(str.substring(0,8), 2);
        Integer oct2 = Integer.parseInt(str.substring(8,16), 2);
        Integer oct3 = Integer.parseInt(str.substring(16,24), 2);
        Integer oct4 = Integer.parseInt(str.substring(24,32), 2);

        return oct1 + "." + oct2 + "." + oct3 + "." + oct4;
    }
}
