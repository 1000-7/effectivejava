package info.unclewang.chapter02.e02;

public class Main {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();
        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
