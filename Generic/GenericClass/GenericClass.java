package JavaPractice.Generic.GenericClass;

public class GenericClass<T> {
    T obj;

    void set(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}
