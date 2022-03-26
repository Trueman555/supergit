package homeWork.oop.oopClassWork.Salad;
//Не успел определить овощи в заданном диапазоне
//Но знаю как. Создать в Salad еще один массив куда через метод закинуть овощи,
// которые будут в задаваемом методом диапазоне между min and max
public class MainSalad {
    public static void main(String[] args) {
        Salad salad=new Salad ();
        salad.addVegetables (new Cucamber (500, 100, "Cucamber"));
        salad.addVegetables (new Tomato (300, 250, "Tomato"));
        salad.addVegetables (new Onion (100, 100, "Onion"));
        salad.addVegetables (new Carrot (50, 150, "Carrot"));

        salad.mixSalad ();
    }
}
