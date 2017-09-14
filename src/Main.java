import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static List<Object> list = new ArrayList<>();

    public static void main(String[] args)
    {
        SolarSystem<String, Double> SolarSystem1 = new SolarSystem<>("Milky Way",100000.00);
        SolarSystem<String, Double> SolarSystem2 = new SolarSystem<>("Andromeda",5000000.75);
        SolarSystem<Integer, Star> Star1 = new SolarSystem<>(42, new Star<>(4000000));
        SolarSystem<String, Star> Star2 = new SolarSystem<>("Sirius", new Star<>(9000000));
        SolarSystem<String, Star> Star3 = new SolarSystem<>("Zeke", new Star<>(1000000));
        SolarSystem<Double, Star> Star4 = new SolarSystem<>(70.52, new Star<>(4000000));

//        System.out.println(SolarSystem1);
//        System.out.println(SolarSystem2);
//        System.out.println(Star1);
//        System.out.println(Star2);
//        System.out.println(Star3);
//        System.out.println(Star4);

        list.add(SolarSystem1);
        list.add(SolarSystem2);
        list.add(Star1);
        list.add(Star2);
        list.add(Star3);
        list.add(Star4);

        //list.sort

        for (Object x: list) {
            System.out.println(x);
        }
    }
}
