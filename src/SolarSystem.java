
public class SolarSystem<T,U extends Comparable<? super U>> implements Comparable<SolarSystem<? super T,U>> {

    private T value1;
    private U value2;

    SolarSystem(T value1, U value2) {
        super();
        this.setValue1(value1);
        this.setValue2(value2);
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public U getValue2() {
        return value2; }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    @Override
    public String toString()
    {
        return "SolarSystem{" + "value1=" + value1 + ", value2=" + value2 + '}';
    }

    @Override
    public int compareTo(SolarSystem<? super T,U> o)
    {
        return o.getValue2().compareTo(value2);
    }
}