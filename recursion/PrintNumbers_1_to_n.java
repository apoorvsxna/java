package recursion;

public class PrintNumbers_1_to_n 
{
    public static void main(String[] args) 
    {
        int n = 15;
        printNumbers(n);
    }   
    public static void printNumbers(int n)
    {
        if(n<1)
        {
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}
