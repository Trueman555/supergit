package homeWork.oop.oopClassWork.Salad;

public class Onion extends Vegetables {
    public Onion(int calories, int weight, String name) {
        super (calories, weight, name);
    }
    @Override
    public void countCalories() {
        int amauntCalories=(int) (getCalories ()*0.1*getWeight ());
        System.out.println ("Amount of calories: "+amauntCalories);

    }
}
