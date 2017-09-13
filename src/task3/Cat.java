
package task3;

/**
 *
 * @author Cainebourne
 */
public class Cat implements Feline {

    int age;
    int weight;
    
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public int getAge() {
         return age;
    }

    @Override
    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("valid age is required");
        }
        this.age = age;
    }

    @Override
    public int getWeight() {
       return weight;
    }

    @Override
    public void setWeight(int weight) {
       if(weight <= 0) {
            throw new IllegalArgumentException("valid weight is required");
        }
        this.weight = weight;
    }
    
}

