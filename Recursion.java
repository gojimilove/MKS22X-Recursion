import java.util.ArrayList;
//import java.util.Integer;

public class Recursion{
    private static double sr(double n, double guess, double tolerance) {
        while (Math.abs(((guess*guess-n)/n)*100) > tolerance) {
            //System.out.println(guess);
            return sr(n, ((n/guess + guess)/2), tolerance);
        }
        return guess;
    }

    private static ArrayList<Integer> sums(ArrayList<Integer> list, int n, int sum) {
        if (n == 0) list.add(sum);
        else {
            sums(list, n-1, sum);
            sums(list, n, sum+n);
        }
        return list;
    }

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */
    public static double sqrt(double n, double tolerance){
        return sr(n, n/2, tolerance);
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
    public static ArrayList<Integer> makeAllSums(int n){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        //return sums(answer, n, 0);
        answer.add(5);
        answer.add(8);
        return answer;
    }

    public static String printArray(ArrayList<Integer> x) {
        String s = "[";
        for (int i = 0; i < x.size(); i++) {
            s+= x.get(i).toString();
            if (i < x.size()-1) {
                s+=", ";
            }
        }
        s+="]";
        return s;
    }

    public static void main(String[] args) {
        System.out.println("==========\nSquare Root Testing:");
        System.out.println(sqrt(100, 0.001));
        System.out.println("\n==========\nFibonacci Testing:");
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        //System.out.println(fib(46));
        System.out.println("\n==========\nMakeAllSums Testing:");
        System.out.println(printArray(makeAllSums(3)));
    }

}