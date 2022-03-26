package homeWork.oop.oopClassWork.Salad;

public class Carrot extends Vegetables {
    public Carrot(int calories, int weight, String name) {
        super (calories, weight, name);
    }

    @Override
    public void countCalories() {
        int amauntCalories=(int) (getCalories () * 0.5 * getWeight ());
        System.out.println ("Amount of calories: " + amauntCalories);

    }
}
