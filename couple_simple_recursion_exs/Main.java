package couple_simple_recursion_exs;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(recrev1("hello"));
    }


    public static double myPow2(double x, int n) {
        if (n==1){
            return x;
        }
        return x*myPow2(x,(n-1));
    }
    public static String recrev(String[] a){
        if(a.length==1){

            return a[0];}


            return a[a.length-1]+recrev(Arrays.copyOfRange(a,0,a.length-1));


    }
    public static String recrev1(String a){
        String[] str_ar= a.split("");
        System.out.println("BAZINGA"+ str_ar[0]);
        return recrev(str_ar);
    }


            }

