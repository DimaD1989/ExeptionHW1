import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

*/
public class Main {
    public static void main(String[] args) {
        int [] array1 = {1,2,4,5,8,7,9,3};
        int [] array2 = {1,2,0,3,5,3,2,1};
        System.out.println(" Первый массив " + Arrays.toString(array1));
        System.out.println(" Второй масссив " + Arrays.toString(array2));
        System.out.println("Разница двух  массивов " + differenceArray(array1, array2));
        System.out.println("Частное двух массивов " + divideArray(array1, array2));
    }

    private static ArrayList<Integer> differenceArray(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = Math.min(array1.length,array2.length);
        int max = Math.max(array1.length,array2.length);
        if (min < 1){
            throw  new RuntimeException(" Один массив пуст ");}
        if (min < max){
            throw  new RuntimeException(" Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            result.add(array1[i] - array2[i]);
        }
        return result;
    }

    private static ArrayList<Float> divideArray(int[] array1, int[] array2) {
        ArrayList<Float> result = new ArrayList<>();
        int min = Math.min(array1.length,array2.length);
        int max = Math.max(array1.length,array2.length);
        if (min < 1){
            throw  new RuntimeException(" Один массив пуст ");}
        if (min < max){
            throw  new RuntimeException(" Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            if(array2[i] != 0){
                result.add((float)array1[i] / array2[i]);
            } else  {
                throw  new RuntimeException(" Деление на ноль");
            }
        }
        return result;
        }

    }

