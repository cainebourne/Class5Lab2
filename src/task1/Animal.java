/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Cainebourne
 */
public class Animal {
    int age;
    int weight;
    
    public void speak(){
        System.out.println("unknown");
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("valid age is required");
        }
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight <= 0) {
            throw new IllegalArgumentException("valid weight is required");
        }
        this.weight = weight;
    }
    
}
