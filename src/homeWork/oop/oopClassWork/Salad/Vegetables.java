package homeWork.oop.oopClassWork.Salad;

abstract public class Vegetables {
    private int calories;
    private int weight;
    //you can get it from toy class names - Tomato... as getClass().getSimpleName()
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
    //void->double or int! No printing in such methods. What if i will need this value in further? How will I get it?
   abstract public void countCalories ();
}
