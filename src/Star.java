
public class Star <U extends Comparable<? super U>> implements Comparable<Star<? super U>> {

    private U age;

    public Star(U age)
    {
        this.setAge(age);
    }

    public U getAge()
    {
        return this.age;
    }

    public void setAge(U age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return String.valueOf(age);
        //return "Star{" + "age=" + age + '}';
    }

    @Override
    public int compareTo(Star<? super U> o)
    {
        return o.getAge().compareTo(this.age);
    }
}