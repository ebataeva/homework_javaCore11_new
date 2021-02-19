public class Apple extends Fruit {
private float weight = 1.0f;

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public Float getWeight() {
        return weight;
    }

    public Apple() {
        this.weight = weight;
    }
}
