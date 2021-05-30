public class Lab9 {
    public Lab9() {
    }

    public static boolean equalsLength(String str1, String str2) {
        if (str1.length() == str2.length()) return true;
        return false;
    }

    public double calculateFactorial(int d) {
        int result = 1;
        for (int i = 1; i <= d; i++) {
            result = result * i;
        }
        System.out.println(result);
        return result;


    }
}
