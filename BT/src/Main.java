import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrays = new int[10];
        System.out.print("Hãy nhập số đầu tiên: ");
        for (int i = 1; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt();
            System.out.print("Hãy nhập số tiếp theo: ");
        }
        int max = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        System.out.println("Số lớn nhất trong các số bạn nhập là: " + max);
    }
}