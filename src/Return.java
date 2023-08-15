// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Return {
    public static void main(String[] args) {

        noReturnSum(3, 6);
        int result = itReturnsSum(0t,2);
        System.out.println("The result value is: " + result);
    }

    private static void noReturnSum(int a, int b) {
         System.out.println("The result without return values is " + (a + b));

    }

    private static int itReturnsSum(int a, int b){
        if (a == 0 && b==0 ) {
            System.out.println("The result return will be 0");
            return 0;
        }

        System.out.println("The result return will be: " + (a +b));
        return (a+b);
    }


}