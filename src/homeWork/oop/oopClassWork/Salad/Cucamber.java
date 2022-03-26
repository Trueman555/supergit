package homeWork.oop.oopClassWork.Salad;

public class Cucamber extends Vegetables {
    public Cucamber(int calories, int weight, String name) {
        super (calories, weight, name);
    }

    @Override
    public void countCalories() {
        int amauntCalories=(int) (getCalories ()*0.2*getWeight ());
        System.out.println ("Amount of calories: "+amauntCalories);

    }
}
