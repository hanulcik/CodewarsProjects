public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) return true;
        return false;
    }
}
