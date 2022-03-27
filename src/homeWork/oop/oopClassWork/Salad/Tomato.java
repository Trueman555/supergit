package homeWork.oop.oopClassWork.Salad;

public class Tomato extends Vegetables {
    public Tomato(int calories, int weight, String name) {
        super (calories, weight, name);
    }
    @Override
    public void countCalories() {
        //0.3->const
        int amauntCalories=(int) (getCalories ()*0.3*getWeight ());
        System.out.println ("Amount of calories: "+amauntCalories);

    }
}
