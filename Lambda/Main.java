package JavaPractice.Lambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list.add(i+1);
        }

        list.forEach((item)-> {System.out.println(item*2);});

        Operation sum = (int a, int b)->  a + b;
        Operation sub = (int a, int b)->  a - b;
        Operation mul = (int a, int b)->  a * b;
        Operation div = (int a, int b)->  a / b;

        System.out.println(calculate(1, 2, sum));
        System.out.println(calculate(1, 2, sub));
        System.out.println(calculate(1, 2, mul));
        System.out.println(calculate(1, 2, div));



    }
    public static int calculate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}
interface Operation {
    int operation(int a , int b);
}
