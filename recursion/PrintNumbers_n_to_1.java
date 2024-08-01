package recursion;

public class PrintNumbers_n_to_1 
{
    public static void main(String[] args) 
    {
        int n = 7;
        printNumbers(n);
    }
    public static void printNumbers(int n)
    {
        if(n==1)
        {
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}
