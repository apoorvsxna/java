package recursion;

public class Factorial 
{
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println(fac(n, 1));
    }
    private static int fac(int n, int ans)
    {
        if(n!=1)
        {
            ans = ans * fac(n-1, n);
        }
        return ans;
    }
}
