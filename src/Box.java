import java.math.BigDecimal;
import java.util.ArrayList;


public class Box<T extends Fruit> {
    private ArrayList<T> list = new ArrayList<>();


    public void addFruit(T fruit, int count) {

        for (int i = 0; i < count; i++) {
            list.add(fruit);
        }
    }


    public float getWeight() {
        float sum = 0.0f;
        if (list.size() > 0) {
            sum = list.size() * list.get(0).getWeight();

        }


        return sum;
    }

//    public ArrayList<T> getList() {
//
//        return (ArrayList<T>) list;
//    }



    public Boolean compare(Box<?> box) {
        return box.getWeight() == this.getWeight();
    }

    public void sendToCard(Box<T> box) {

        for (T f : list) {
            box.add(f);
        }

        list.clear();


    }
    public void add(T fruit) {
        list.add(fruit);
    }

}