package homeWork.oop.oopClassWork.Salad;

public class Salad {

    private Vegetables[] arrayVegetables;
    private int index;
    int sumWeight;

    public Salad() {
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
            arrayVegetables[i].countCalories ();

        }
        System.out.println ("Weight of the salad:" + sumWeight + " gram");
    }

}

