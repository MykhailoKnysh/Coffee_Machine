import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();
        boolean contains = false;

        for (int i = 0; i < length; i++) {
            if (arr[i] == number) {
                contains = true;
                break;
            }
        }

        System.out.println(contains);
    }
}