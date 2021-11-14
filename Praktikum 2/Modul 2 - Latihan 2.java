public class ProgramSederhanaJava2 {
    public static void main(String[] args) {
        int a,d;
        int[][] matriks = {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,0,1,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,1,0,0,0,0,0,0,0,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,1,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0},
                {0,0,0,1,0,0,0,0,0,0,0,1,0,0,0},
                {0,0,1,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        for (a=0;a<=13;a++) {
            for (d=0;d<=14;d++) {
                if(matriks[a][d] == 1){
                    System.out.print("*");
                } else if (matriks[a][d] == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
