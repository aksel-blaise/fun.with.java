public class BooleanTypes {
    public static void main(String[] args) {
        boolean isRaining = false;
        isRaining = true;
        isRaining = true;
        boolean isDriving = false;

        if(isRaining) {
            System.out.println("Take an umbrella");
            System.out.println("Wear boots");

            if(isDriving) {
                System.out.println("Be careful");
            }
        }

        System.out.println("Go to work");

    }
}
