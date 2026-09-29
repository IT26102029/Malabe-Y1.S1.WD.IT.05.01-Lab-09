public class IT26102029Lab9Q3 {
    
    // add two integers and return the result
    public static int add(int a, int b) {
        return a + b;
    }

    // multiply two integers and return the result
    public static int multiply(int a, int b) {
        return a * b;
    }

    // receive an integer and return its square
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // i. Calculation for (3 * 4 + 5 * 7)^2
        int expr1Part1 = multiply(3, 4);
        int expr1Part2 = multiply(5, 7);
        int expr1Sum = add(expr1Part1, expr1Part2);
        int result1 = square(expr1Sum);

        // ii. Calculation for (4 + 7)^2 + (8 + 3)^2
        int sq1 = square(add(4, 7));
        int sq2 = square(add(8, 3));
        int result2 = add(sq1, sq2);

        // Displaying results based on expected output format
        System.out.println("Result of (3*4+5*7)^2 : " + result1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + result2);
    }
}