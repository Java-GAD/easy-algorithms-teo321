public class Fibonacci {
    public static int generateFibonacci(int n)
    {
        if(n==0) return 0;
        else if(n==1) return 1;
        else {
            return (generateFibonacci(n-1) + generateFibonacci(n-2));
        }
        
    }
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++)
        {
            System.out.print(generateFibonacci(i) + " ");
        }
    }    
}
