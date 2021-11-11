import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        initializeList(array);

        System.out.println("Количество отрицательных чисел: " + otrArray(array));
    }

    private static void initializeList(List<Integer> array){
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Введите число(для выхода введите 100):");
            array.add(scanner.nextInt());
        }while (array.get(array.size()-1) != 100);

        array.remove(array.size()-1);
    }

    private static int otrArray (List<Integer> array){
        int count = 0;

        for(Integer el:array){
            if (el<0) count++;
        }

        return count;
    }
}


