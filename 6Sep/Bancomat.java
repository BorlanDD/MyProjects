import java.util.Scanner; 

class Bancomat {
  public static void main (String[] args) {
    byte exit = 2;
    while (exit == 2) {
      System.out.print("Enter amount: ");
      Scanner scanner = new Scanner(System.in);
      int sum = scanner.nextInt();
      int buf;
      buf = sum / 5000;
      sum %= 5000;
      System.out.println("5 000 - " + buf);
      buf = sum / 1000;
      sum %= 1000;
      System.out.println("1 000 - " + buf);
      buf = sum / 500;
      sum %= 500;
      System.out.println("500 - " + buf);
      buf = sum / 100;
      sum %= 100;
      System.out.println("100 - " + buf);
      buf = sum / 50;
      sum %= 50;
      System.out.println("50 - " + buf);
      buf = sum / 10;
      sum %= 10;
      System.out.println("10 - " + buf);
      buf = sum / 5;
      sum %= 5;
      System.out.println("5 - " + buf);
      buf = sum / 2;
      sum %= 2;
      System.out.println("2 - " + buf);
      buf = sum / 1;
      sum %= 1;
      System.out.println("1 - " + buf);
      System.out.println("To exit press: 1");
      System.out.println("To continue press: 2");
      exit = scanner.nextByte();
    }
  }
}
