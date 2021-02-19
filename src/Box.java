import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> list = new ArrayList<>();


    public void putFruitToBox(Fruit fruit, int count) {

        if ((this.getList().size() !=0 && this.getList().get(0) == fruit) || this.getList().size() == 0) { //проверяем, что либо коробка пустая, либо в ней такие же фрукты
            for (int i = 0; i < count; i++) {
                list.add(fruit);
            }
        }
    }



    public Float getWeight() {
        Float sum = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getWeight();
        }
        System.out.println(sum);
        return sum;
    }

    public ArrayList<Fruit> getList() {
        return list;
    }

    /*
    public static Boolean compare(Box box1, Box box2) {
        if (box1.getList().get(0) == (box2.getList().get(0)) && box1.getList().size() == box2.getList().size()) {
            return true;
        }
        return false;
        }
    */
    public Boolean compare(Box box) {
        if (this.getList().get(0) == (box.getList().get(0)) && this.getList().size() == box.getList().size()) {
            return true;
        }
        return false;
    }

    public void sendToCard(Box box) {
        if (this.getList().get(0) == (box.getList().get(0))) {
            for (Fruit f : this.getList()) {
                box.getList().add(f);
            }
            for (int i = 0; i < this.getList().size() ; i++) {
                this.getList().clear();
            }


        }else{
            System.out.println("нельзя так делать. типы не соответствуют");
        }
    }
}