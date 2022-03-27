package homeWork.oop.oopClassWork.Salad;
//find vegetables in calorie range?
public class Salad {

    private Vegetables[] arrayVegetables;
    private int index;
    int sumWeight;

    public Salad() {
        //better to pass 5 in constructor -> int amountOfVegetables
        arrayVegetables=new Vegetables[5];
        index=0;
    }

    public void addVegetables(Vegetables vegetables) {
        arrayVegetables[index++]=vegetables;

    }

    public void mixSalad() {
        System.out.println ("Salad includes " + index + " vegetables");
        for (int i=0; i < index; i++) {
            sumWeight+=arrayVegetables[i].getWeight ();
            System.out.print (arrayVegetables[i].getName () + " " + arrayVegetables[i].getCalories () + " calories" + arrayVegetables[i].getWeight () + " gram");
            System.out.println ();
            //another method
            arrayVegetables[i].countCalories ();

        }
        //another method which return sumWeight and then in Main you can get it and print
        System.out.println ("Weight of the salad:" + sumWeight + " gram");
    }

}

