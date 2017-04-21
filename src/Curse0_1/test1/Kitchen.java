package Curse0_1.test1;

/**
 * @author Created by knyazev.v on 21.04.2017.
 *
 */
public class Kitchen {

    public static void main(String[] args) {
        System.out.println("main");
        Kitchen kitchen = new Kitchen();
        cookSoup();
        kitchen.cookBreakfast();
    }

    private static void cookSoup(){
        // sout + Tab вывод
        // Ctrl + D дублирование строки
        System.out.println("Boil water");
        System.out.println("...");
        System.out.println("done");
    }

   private void cookBreakfast(){
        System.out.println("Breakfast done");
    }
}
