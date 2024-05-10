package JavaPractice.ObjectCloning;

import java.util.Arrays;

public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human main = new Human("Main", 18);
        Human clone = (Human) main.clone();

        //Main
        System.out.println("Name : " + main.name + "\nAge : " + main.age+"\nArray : " + Arrays.toString(main.array));
        //Twin
        System.out.println("Name : " + clone.name + "\nAge : " + clone.age+"\nArray : " + Arrays.toString(clone.array));


        // Modifiying array 
        clone.array[0] = 100;
        
        System.out.println("Main Array : " + Arrays.toString(main.array));
        System.out.println("Clone Array : " + Arrays.toString(clone.array));

    }
}

class Human implements Cloneable{
    String name;
    int age;
    int[]array;
    Human(String name, int age) {
        this.name = name;
        this.age = age;
        array = new int[]{1,2,3,4};
    }
    public Object clone() throws CloneNotSupportedException {
        Human clone = (Human) super.clone();
        clone.array = new int[clone.array.length];
        for(int i = 0; i < clone.array.length; i++) {
            clone.array[i] = this.array[i];
        }
        return clone;
    }

}
