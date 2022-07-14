public class Dog {
    private String name;
    private int weight;

    public Dog() {

    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Имя = " + name + " | Вес = " + weight + "\n";
    }
}
