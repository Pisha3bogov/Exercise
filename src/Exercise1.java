import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        otrArray();
    }
    private static void otrArray (){
        List<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Введите число(для выхода введите 100):");
            array.add(scanner.nextInt());
        }while (array.get(array.size()-1) != 100);

        array.remove(array.size()-1);

        int count = 0;

        for(Integer el:array){
            if (el<0) count++;
        }

        System.out.println("Количество отрицательных чисел: " + count);
    }
}


