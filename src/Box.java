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

    public ArrayList<Fruit> getList() {
        return (ArrayList<Fruit>) list;
    }


    /*
        public static Boolean compare(Box box1, Box box2) {
            if (box1.getList().get(0) == (box2.getList().get(0)) && box1.getList().size() == box2.getList().size()) {
                return true;
            }
            return false;
            }
        */
    public  Boolean compare(Box box) {
        return box.getWeight() == this.getWeight();
    }

    public void sendToCard(Box box) {

        for (Fruit f : this.getList()) {
            box.getList().add(f);
        }
        for (int i = 0; i < this.getList().size(); i++) {
            this.getList().clear();
        }


    }
}