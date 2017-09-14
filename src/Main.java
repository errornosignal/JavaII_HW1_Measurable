
public class Main
{
    public static void main(String[] args)
    {
        SolarSystem<String, Double> SolarSystem = new SolarSystem<>("Milky Way",100000.00);
        SolarSystem<Integer, Star> Star = new SolarSystem<>(42, new Star<>(4000000));

        System.out.println(SolarSystem);
        System.out.println(Star);





    }
}
