import java.util.ArrayList;

class ProblemOne{
    public static int[] countBits(int n) {
        int ct = 0;
        int [] result = new int[n+1];
        for(int i=0;i<n;i++)
        {
            ct = 0;
            String binaryString = Integer.toBinaryString(i);
            char []BinaryCharArray=binaryString.toCharArray();
            for(int j=0; j<binaryString.length();j++)
            {
                if(BinaryCharArray[j]=='1')ct++;
            }
            result[i]=ct;
        }
        return result;
        
    }
    public static void main(String[] args) {
     System.out.println(countBits(2));   
    }
}