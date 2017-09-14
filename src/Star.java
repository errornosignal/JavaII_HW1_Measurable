
public class Star <T> implements Measurable<T>
{
    private T age;

    public Star(T age) {
        this.setCommonName(age);
    }

    @Override
    public String toString() {
        return String.format("Age=('%s')", getAge());
    }

    private T getAge() {
        return this.age;
    }

    private void setCommonName(T age) {
        this.age = age;
    }

    @Override
    public void getMeasure(T obj) {
    }
}
