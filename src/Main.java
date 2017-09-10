
public class Main
{
    public static void main(String[] args)
    {
        SolarSystem<String, Double> MilkyWay = new SolarSystem<String, Double>("Milky Way",100000.00);
        System.out.println(MilkyWay);




        //int counter = 3;

//        for (int i = 0; i < counter; i++)
//        {
//            int starNumber = i + 1;
//            System.out.println("Enter info for star " + starNumber);
//            String commonName = Validator.getString("Common name of star: ");
//            Double distance = Validator.getDouble("Distance to star: ");
//            System.out.println();
//
//            Star star = new Star(commonName, distance);
//            //Planet planet = new Planet(commonName, distance);
//            stars.add(star);
//        }
//
//        for (int i = 0; i < counter; i++)
//        {
//            System.out.println(stars.get(i));
//        }
    }
}
