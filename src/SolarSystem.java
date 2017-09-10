public class SolarSystem<T,U>
{
    private T name;
    private U distanceAcross;

    public SolarSystem(T name, U distanceAcross) {
        this.setName(name);
        this.setDistance(distanceAcross);
    }

    @Override
    public String toString() {
        return String.format("System{name=%s, distanceAcross=%s}", this.getName(), this.getDistanceAcross());
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getDistanceAcross() {
        return distanceAcross;
    }

    public void setDistance(U distanceAcross) {
        this.distanceAcross = distanceAcross;
    }

}
