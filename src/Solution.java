public class Solution {
    public static int reverse(int x) {
        int fuhao = 1;
        if(x < 0)
        {
            x = Math.abs(x);
            fuhao = -1;
        }
        int len = String.valueOf(x).length();
        double result = 0,n = 0,k = 0;


        while(--len >= 0)
        {
            n = x / (int)Math.pow(10,len);

            result += n * Math.pow(10,k);
            k++;
            x -= n * Math.pow(10,len);
        }
        if(fuhao * result > Integer.MAX_VALUE ||
                fuhao * result < Integer.MIN_VALUE)
            return 0;
        return (int)result * fuhao;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

}