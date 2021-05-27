public class NestedIf {
    public static void main(String[] args)  {
        int x = 3;
        int y = 2;

        if (x > 2) {
            if (y > 2) {
                int z = x + y;
                System.out.println("z is " + z);
            }
            else {
                System.out.println("y is " + y);
            }
        }
        else
            System.out.println("x is " + x);
    }
}
