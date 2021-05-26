public class TwoWayIf {
    public static void main(String[] args) {
        int speed = 90;
        speed = 70;

        if(speed > 75) {
            System.out.println("Give a speeding ticket");
            System.out.println("Go slow");
        }
        else {
            System.out.println("You are a good driver");
        }
        System.out.println("Be careful on the road");
    }
}
