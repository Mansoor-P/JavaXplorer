package challenge;

public class AllAlphabet {
   public static long seriesSum(int n) {
        // code here
        n=n*(n+1)/2;
//        System.out.println(n);
         return n;
    }
    public static void main(String args[])
    {
//        char ch;
//        for( ch = 'a' ; ch <= 'z' ; ch++ )
//            System.out.println(ch);

        System.out.println(seriesSum(2));;
    }

}
