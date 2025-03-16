import java.util.Scanner;

public class atv3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Digite o número para ter elementos organizados a partir dele");
        int k = scanner.nextInt();
        System.out.println(k);

        partitionArray(array, k);

        System.out.println("Array reorganizado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static void partitionArray(int[] array, int k) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= k) {
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                index++;
            }
        }
    }
}
