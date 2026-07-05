public class GreatestOfTwo {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;

        if (a > b) {
            System.out.println(a + " is the greatest number");
        } else if (b > a) {
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
