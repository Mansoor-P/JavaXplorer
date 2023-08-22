package dsa.practice.recurssion;

public class NatualNumbers {
    public static void sumofNumbers(int i,int n,int sum){

        if(n==i){
            return;
        }
        sum=n*(n+1)/2;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumofNumbers(1,5,0);
    }
}
