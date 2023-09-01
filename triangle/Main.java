package triangle;


public class Main {
    public static void main(String[] args) {
//        triangle(5);
//        System.out.println(myPow2(2.1,3));
//        System.out.println(recrev1("Hola"));
       triangle(5);

    }



    public static void triangle(int a){

        for (int i = 1; i <= a; i++) {
            for (int j=i;j<a;j++){
                System.out.print(" ");
            }
            for (int z=1;z<=i;z++){
//                if(i==a || z==i || z==1)
                    System.out.print("* ");
//                else
//                    System.out.print(" ");

            }
            System.out.println();
        }

        for (int i = 0; i <= a; i++) {
            for (int j=0;j<a;j++){
                System.out.print(i+""+j+" ");
            }
//            for (int z=0;z<i;z++){
//                System.out.print("* ");
//
//            }
            System.out.println();
        }
    }
}
