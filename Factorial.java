public class Factorial {

    public int num;

    public Factorial(int num) {
        this.num = num;
    }

    int getFactorial() {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        String result = "Factorial: " + num + "! = ";
        for (int i = 1; i <= num; i++) {
            result += i;
            if (i < num) {
                result += " * ";
            }
        }
        result += " = " + getFactorial();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial(10));
    }
}