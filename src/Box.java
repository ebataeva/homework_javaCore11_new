import java.math.BigDecimal;
import java.util.ArrayList;


public class Box <T extends  Fruit> {
    private ArrayList<Fruit> list = new ArrayList<>();


    public <T> void putFruitToBox(T fruit, int count) {

        if (this.getList().size() == 0 || this.getList().get(0) == fruit) { //проверяем, что либо коробка пустая, либо в ней такие же фрукты
            for (int i = 0; i < count; i++) {
                list.add((Fruit) fruit);
            }
        }
    }

  /*  public <T> void putFruitToBox(Fruit fruit, int count) {

        if (this.getList().size() == 0 || this.getList().get(0) == fruit) { //проверяем, что либо коробка пустая, либо в ней такие же фрукты
            for (int i = 0; i < count; i++) {
                list.add(fruit);
            }
        }
    }
*/


    public <T> T getWeight() {
        Float sum = 0.0f;
        if (list.size() > 0) {
            sum = list.size() * list.get(0).getWeight();

        }
        System.out.println(sum);
        BigDecimal num = new BigDecimal(sum).setScale(1, BigDecimal.ROUND_UNNECESSARY);

        return (T)num;
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
    public <T> Boolean compare(Box box) {
        System.out.printf("вес сравниваемой коробки =  %s, а весь нашей коробки = %s", this.getWeight(), box.getWeight());
        if (this.getWeight().equals(box.getWeight())) {
            return true;
        }
        return false;
    }

    public void sendToCard(Box box) {
        if (this.getList().get(0) == (box.getList().get(0))) {
            for (Fruit f : this.getList()) {
                box.getList().add(f);
            }
            for (int i = 0; i < this.getList().size(); i++) {
                this.getList().clear();
            }


        } else {
            System.out.println("нельзя так делать. типы не соответствуют");
        }
    }
}