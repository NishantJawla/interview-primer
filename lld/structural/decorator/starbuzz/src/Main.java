import berverages.Beverage;
import berverages.HouseBlend;
import condiments.Mocha;
import condiments.Soy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to the Starbuzz Decorator Pattern\n");
//        House Blend is latte
//        Let's create double mocha soy latte

        Beverage coffee = new HouseBlend();
        coffee = new Soy(coffee);
        coffee = new Mocha(coffee);
        coffee = new Mocha(coffee);


        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
    }
}