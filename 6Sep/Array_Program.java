class Array_Program {
  public static void main (String[] args) {
    int[] a = {3, 6, 6, 4, 2, 1, 10, 3, 4};
    for (int i = a.length - 1; i >= 0; i--) {
      System.out.println("a[" + i + "] = " + a[i]);
    }
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[a.length - i - 1];
      System.out.println("a[" + i +  "] = " + b[i]);
    }
  }
}
