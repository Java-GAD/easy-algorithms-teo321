

public class FizzBuzz {
    public static void FizzBuzz1(){
        for(int i=0;i<=100;i++)
        {
            if(i%3 == 0 && i%5 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
        }
    }
    public static void main(String[] args) {
        FizzBuzz1();
    }
}
