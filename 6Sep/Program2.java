import java.util.Scanner;
import java.util.Random;

class Program2 {
  public static void main (String[] args) {
    byte exit = 2;
    while (exit == 2) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("\nInput the amount of numbers in to the array: ");
      int kol = scanner.nextInt();
      int[] mas = new int[kol];
      int mp = 1;
      int sum = 0;
      Random rand = new Random();
      System.out.print("The array: ");
      for (int i = 0; i < kol; i++) {
        mas[i] = rand.nextInt(20) - 10;
        System.out.print(mas[i] + " ");
        if ((mas[i] % 2 == 0) && (mas[i] != 0))
          mp *= mas[i];
        if (mas[i] < 0)
          sum += mas[i];
      }
      if (mp == 1) mp = 0;
      System.out.println("\nMultiplication = " + mp);
      System.out.println("Sum = " + sum + "\n");
      System.out.println("To exit press: 1");
      System.out.println("To continue press: 2");
      exit = scanner.nextByte();
    }
  }
}
