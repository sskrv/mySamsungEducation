import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Введите элементы массива (для завершения ввода введите нечисловой символ):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            list.add(num);
        }

        // Преобразование ArrayList в массив
        Integer[] array = list.toArray(new Integer[0]);

        System.out.println("Введенный массив: " + java.util.Arrays.toString(array));
    }
}
