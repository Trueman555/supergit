package homeWork.oop.oopClassWork.Salad;

abstract public class Vegetables {
    private int calories;
    private int weight;
    private String name;

    public Vegetables(int calories, int weight, String name) {
        this.calories=calories;
        this.weight=weight;
        this.name=name;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
   abstract public void countCalories ();
}
