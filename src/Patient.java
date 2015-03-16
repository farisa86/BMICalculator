/**
 /**
 * Created by jc302404 on 16/03/15.
 */
public class Patient {
    private String name;
    private int age;
    private double height, weight;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public double getBMI(){
        double result = weight/(height*height);
        return result;

    }


}

