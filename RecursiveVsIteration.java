class RecursiveVsIteration{
   public static int fibonacci(int n){
      //base case recursive
      if(n <= 2){
         return 1;
      }
      return fibonacci(n-1)+fibonacci(n-2);
   }
   //iterative
   public static int fib(int n){
      int sum = 0;
      int fib = 1;
      if(n <= 2){
         return 1;
      }
      for(int i = 0; i < n; i++){
         sum += fib;
         fib = sum - fib;
      }
      return sum;
   }
   public static void main(String [] args){
      System.out.print("\nRecursive Fibonacci: "+fibonacci(4));
      System.out.print("\nIterative Iterative: "+fib(4));
   }
}