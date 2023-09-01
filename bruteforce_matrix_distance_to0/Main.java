package bruteforce_matrix_distance_to0;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    }




    public static int[][] updateMatrix(int[][] mat) {
        int[][] ar = new int[mat.length][mat[0].length];
        ArrayList<Integer> dem_i =new ArrayList<Integer>();
        ArrayList<Integer> dem_j =new ArrayList<Integer>();

        for (int i =0;i<mat.length;i++){

            for(int j =0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    ar[i][j]=0;
                    dem_i.add(i);
                    dem_j.add(j);

                }


            }

        }
        for (int i =0;i<mat.length;i++){
            for(int j =0;j<mat[i].length;j++){
                int closest_distance=999;
                if(mat[i][j]!=0) {

                    for (int z = 0; z <= dem_i.size(); z++) {
                        int calculated_distance = Math.abs(i - dem_i.get(z)) + Math.abs(j - dem_j.get(z));
                        if (calculated_distance < closest_distance) {
                            closest_distance = calculated_distance;
                        }
                    }
                    ar[i][j]=closest_distance;
                }
            }

        }
        return ar;

    }

            }

