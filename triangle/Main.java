package triangle;


public class Main {
    public static void main(String[] args) {

       triangle(5);

    }



    public static void triangle(int a){

        for (int i = 0; i <= a; i++) {
            for (int j=i;j<a;j++){
                System.out.print(" ");
            }
            for(int d =a;d>i;d--){
                System.out.print(" ");
            }
            for (int z=1;z<=i*2-1;z++){


                System.out.print("* ");


            }
            System.out.println();
        }


    }
}
