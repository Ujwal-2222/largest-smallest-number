import java.util.Scanner;

public class LargestSmallestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = sc.nextInt();
    int[] array = new int[size];
    System.out.println("Enter array elements:");
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    int max = array[0];
    int min = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i] > max)
        max = array[i];
      if (array[i] < min)
        min = array[i];
    }
    System.out.println("Largest: " + max);
    System.out.println("Smallest: " + min);
    }
}