public class MathClass {
    public static void main(String[] args) {
        // compute 2 ^ 3 ( 2 to the power of 3)
        int result = (int) Math.pow(2, 3) ; // all math methods return a double type
        System.out.println("the answer is " + result);

        // Find sine of 90 degrees
        double radian = Math.toRadians(90);
        System.out.println(Math.sin(radian));

        // Find sqrt of 36
        System.out.println(Math.sqrt(36));

        // x = 5.4; find ceiling/floor; ceiling is 6.0;
        // floor of x is 5.0
        System.out.println(Math.floor(5.4));
        System.out.println(Math.ceil(5.4));

        // Find minimum of 2.5 and 3.6
        System.out.println(Math.min(2.5, 3.6));

        // Find maximum of 2.5 and 3.6
        System.out.println(Math.max(2.5, 3.6));

        // Find maximum of 4.2, 5.7, 8.0
        double max = Math.max(Math.max(4.2, 5.7), 8.0);
        System.out.println(max);

    }
}
