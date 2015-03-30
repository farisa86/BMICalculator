/**
 /**
 * Created by jc302404 on 16/03/15.
 */
public class Patient {
    private String name;
    private int age;
    private double height, weight;

    public Patient(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBMI() {
        return weight / Math.pow(height, 2);
    }

    public void setName(String newName){
        name = newName;

    }
    public void setAge(int newAge){
        age = newAge;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }
    public void setHeight(double newHeight){height = newHeight;
    }


}





