package app;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(exponentLoop(2,10));
        System.out.println(exponentRecursive(2,10));
    }
    // Answer A:
    public static int exponentLoop(int b, int n) {
        int value = b;
        for (int i = 2; i <= n; i++) {
            value = value * b;
        }
        return value;
    }

    // Answer B:
    public static int exponentRecursive(int b, int n) {
        if (n == 1) {
            return b;
        } else {
            return b * exponentRecursive(b, n - 1);
        }
    }
}

// Question: Which is more time efficient?
// Answer: The iterative solution is more efficient and has a better time complexity. This is because when we
// each function in the recursive solution, we end up calling the same function many times. A classic example
// is the fibonacci question. When we run fib(5), we do the following
//      fib(5)
//   fib(1) fib(4)
//      fib(1)  fib(3)
//          fib(1)  fib(2)
//              fib(1) fib(1)
// the value of fib(1) returns 1 and we count it up 5 times so fib(5) is 5. 
// but we called fib(1) five times, plus the other functions 4 times. for a total of 9 calls. 
// time complexity for recursive functions become exponential O(2^n).
// The call stack for recursive functions is also greater than in iterative solutions. 
