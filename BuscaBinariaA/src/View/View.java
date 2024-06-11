package View;

import java.util.Scanner;

public class View {
	private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int[] getUserInput() {
        int[] array = new int[10];
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int getElementToSearch() {
        System.out.print("Digite o número que deseja procurar: ");
        return scanner.nextInt();
    }

    public void displayArray(int[] array) {
        System.out.print("Array Ordenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void displaySearchResult(int elemento, int resultado) {
        if (resultado == -1) {
            System.out.println("Elemento " + elemento + " não encontrado.");
        } else {
            System.out.println("Elemento " + elemento + " encontrado no índice " + resultado + ".");
        }
    }
}
