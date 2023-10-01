public class CalculateSum {
    public static int calculateSum(int n)
    {
        int result = 0;
        for(int i=0;i<=n;i++)
        {
            result +=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculateSum(8));
    }
}
