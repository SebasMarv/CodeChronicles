package G_EjerciciosFundamentosJava;

public class g_RellenarMatriz {
    public static void main(String[] args) {

        // 4 filas, 5 columnas
        int[][] matriz = new int[4][5];

        // Rellenar la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 5;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
}
