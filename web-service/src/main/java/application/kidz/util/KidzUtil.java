package application.kidz.util;

public class KidzUtil {
    public static String getString2Id(String str) {
        return str.toLowerCase().replaceAll(" ","_");
    }
}
