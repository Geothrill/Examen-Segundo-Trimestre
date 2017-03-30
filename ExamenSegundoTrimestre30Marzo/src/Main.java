import java.util.Scanner;

/**
 * Created by pepe_ on 30/03/2017.
 */
public class Main {
    public static void main(String[] args) {
       Frigorifico barato = new Frigorifico(
               "manolo",
               "antonio",
               500,
               'F',
               1.50,
               80,
               10,
               200,
               180
       );
        Frigorifico caro = new Frigorifico(
                "manolo",
                "antonio",
                1500,
                'A',
                1.50,
                80,
                90,
                200,
                180
        );

        System.out.println(barato.precioTransporte());
        System.out.println(barato.precioBruto());

    }
}
