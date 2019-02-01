public class Recursion{

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double h(double n, double guess, double tolerance) {
        while (Math.abs(((guess*guess-n)/n)*100) > tolerance) {
            //System.out.println(guess);
            return h(n, ((n/guess + guess)/2), tolerance);
        }
        return guess;
    }

    public static double sqrt(double n, double tolerance){
        return h(n, n/2, tolerance);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    /*As Per classwork*/
    //public static ArrayList<Integer> makeAllSums(int n)){
        
    //}

    public static void main(String[] args) {
        System.out.println(sqrt(100, 0.001));
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(46));
    }

}