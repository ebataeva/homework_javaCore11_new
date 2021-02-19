public class Orange extends Fruit {
    private Float weight = 1.5f;

    @Override
    public Float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }

    public Orange() {
        this.weight = weight;
    }



}
