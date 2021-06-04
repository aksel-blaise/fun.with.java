// what is the difference between a and A?
// differences between capitals and lower case characters
// is 32

public class Question {
    public static void main(String[] args) {

        char someChar = 'G';
        char result = (char)(someChar + 32);
        System.out.println(result);

        System.out.println(Character.toLowerCase('G'));
    }
}
