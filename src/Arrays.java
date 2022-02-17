public class Arrays {
    public static void main(String[] args) {

    int[][] matriz1 = new int[3][3];
    imprimeMatriz(matriz1);
        System.out.println();
    matrizTranspuesta(matriz1);
    imprimeMatriz(matriz1);
    }


    public static void imprimeMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrizTranspuesta(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matriz[i][i];
            }

        }

    }


}
