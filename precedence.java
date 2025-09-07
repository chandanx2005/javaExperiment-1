public class precedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int result = a + b * c - d / e;
        /* Operator Precedence:
           1. Multiplication and Division are performed before Addition and Subtraction.
           2. From left to right: b * c is evaluated, then d / e, and finally the results are combined.
        */


        System.out.println("Result: " + result);
    }
}
    

