import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  static  String[] numbers = {"раз", "два", "три", "четыре"};
    static Integer[] nums = {1,2,3,4,5};

    public static void main(String[] args) {
        testFirstPartOfHomework();
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        box1.putFruitToBox(apple, 10);
        box2.putFruitToBox(orange, 15);
        box3.putFruitToBox(apple, 2);
        box3.sendToCard(box1);
        box1.putFruitToBox(apple, 1);
        System.out.println("вес 3 = "+box3.getWeight());
        System.out.println("вес 1 = "+box1.getWeight());
        System.out.println(box1.compare(box2));

    }

    private static void testFirstPartOfHomework() {
        swap(numbers, 1, 2);
        System.out.println(Arrays.toString(numbers));
        swap(nums, 1, 2);
        System.out.println(Arrays.toString(nums));
        System.out.println(changeArray(numbers));
    }

    public static <T> void swap(T[]arr, int index, int index2){ //меняет элементы массива местами
        if(index<arr.length && index2 < arr.length){
        T temp = arr[index];
        arr[index]= arr[index2];
        arr[index2] = temp;}
        else{
            System.out.println("нет элементов с таким индексом");
        }
    }


    public static <T> ArrayList changeArray(T[] arr){
        ArrayList <T> list =  new ArrayList<>();
        for(T a : arr){
            list.add(a);
        }
        return list;
    }
}
