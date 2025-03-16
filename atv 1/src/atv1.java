import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        
        }
        
        System.out.println("O número duplicado é: " + duplicatas(array));
        scanner.close();
    }

    public static int duplicatas(int[] array) {
        List<Integer> descobrir = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (descobrir.contains(array[i])) {
                return array[i];
            } else {
                descobrir.add(array[i]);
            }
        }
        return -1; 
    }
}