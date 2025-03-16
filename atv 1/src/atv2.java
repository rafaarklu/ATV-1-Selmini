import java.util.Scanner;



public class atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        
        int[] array = new int[n];
        
        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        String resultado = verificarSoma(array);
        if (resultado != null) {
            System.out.println("Existe um elemento que é a soma de dois anteriores: " + resultado);
        } else {
            System.out.println("Nenhum elemento é a soma de dois anteriores.");
        }
        scanner.close();
    }

    public static String verificarSoma(int[] array) {
        for (int i = 2; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    if (j != k && array[i] == array[j] + array[k]) {
                        return array[j] + " + " + array[k] + " = " + array[i];
                    }
                }
            }
        }
        return null;
    }
}
