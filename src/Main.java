import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static List<SolarSystem> ssList = new ArrayList<>();

    public static void main(String[] args)
    {
        SolarSystem<String, Star<Integer>> Star1 = new SolarSystem<>("Sol", new Star<>(4000000));
        SolarSystem<String, Star<Integer>> Star2 = new SolarSystem<>("Sirius", new Star<>(90000000));
        SolarSystem<String, Star<Integer>> Star3 = new SolarSystem<>("Zeke", new Star<>(10000));
        SolarSystem<String, Star<Integer>> Star4 = new SolarSystem<>("Signus", new Star<>(200000));

        ssList.add(Star1);
        ssList.add(Star2);
        ssList.add(Star3);
        ssList.add(Star4);

        System.out.println();
        System.out.println("******PRE SORT*****");
        for (Object x: ssList) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println(Star1.getValue1() + " " + Star1.getValue2());
        System.out.println(Star2.getValue1() + " " + Star2.getValue2());
        System.out.println(Star3);

        ssList.sort((o1, o2) -> 0);

        System.out.println();
        System.out.println("*****POST SORT*****");
        for (Object x: ssList) {
            System.out.println(x);
        }
    }
}
