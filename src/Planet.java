public class Planet<T extends Measurable<T>>
{
    private T age;

    public Planet(T age) {
        this.setCommonName(age);
    }

    @Override
    public String toString() {
        return String.format("Age = ('%s')", this.getAge());
    }

    private T getAge()
    {
        return age;
    }

    private void setCommonName(T age)
    {
        this.age = age;
    }
}
