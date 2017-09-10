public class Planet<T extends Measurable<? super T>>
{
    private T age;

    public Planet(T age) {
        this.setCommonName(age);
    }

    @Override
    public String toString() {
        return String.format("Age = ('%s')", this.getAge());
    }

    public T getAge()
    {
        return age;
    }

    public void setCommonName(T age)
    {
        this.age = age;
    }
}
