import java.util.Scanner;

class FunctionMult {
  public static void main (String[] args) {
    System.out.print("Enter the amount of rows in the first array: ");
    Scanner sc = new Scanner(System.in);
    int rows1 = sc.nextInt();
    System.out.print("Enter the amount of columns in the first array: ");
    int cols1 = sc.nextInt();
    int[][] mas1 = new int[rows1][cols1];
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < cols1; j++) {
        System.out.printf("A[%d][%d] = ", i, j);
        mas1[i][j] = sc.nextInt();
      }
    }
    int rows2 = cols1;
    System.out.print("Enter the amount of columns in the second array: ");
    int cols2 = sc.nextInt();
    int[][] mas2 = new int[rows2][cols2];
    for (int i = 0; i < rows2; i++) {
      for (int j = 0; j < cols2; j++) {
        System.out.printf("B[%d][%d] = ", i, j);
        mas2[i][j] = sc.nextInt();
      }
    }
    System.out.println("Your first array: ");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < cols1; j++) {
        System.out.print(mas1[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Your second array: ");
    for (int i = 0; i < rows2; i++) {
      for (int j = 0; j < cols2; j++) {
        System.out.print(mas2[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Done! Result: ");
    int[][] masres = result(mas1, mas2);
    for (int i = 0; i < masres.length; i++) {
      for (int j = 0; j < masres[0].length; j++) {
        System.out.print(masres[i][j] + " ");
      }
      System.out.println();
    }
  }
  static int[][] result (int[][] mas1, int[][] mas2) {
    int[][] masres = new int[mas1.length][mas2[0].length];
    for (int i = 0; i < mas1.length; i++) {
      for (int k = 0; k < mas2[0].length; k++) {
        for (int j = 0; j < mas1[0].length; j++) {
          int itog = 0;
          itog = mas1[i][j] * mas2[j][k];
          masres[i][k] += itog;
        }
      }
    }
    return masres;
  }
}
