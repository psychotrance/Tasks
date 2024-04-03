package Lesson10Static_constants.Task2;

/**
 * реализуйте неизменность поля названия у класса Counter.
 * Ведь очень странно, если мы можем менять название счетчика по ходу выполнения
 * программы, не так ли?
 */
public class Counter {
    static final String NAME = "counter";
    public int counter;

    public Counter() {
        counter = 0;
    }
    public Counter(int counter) {
        this.counter = counter;
    }
    public int increase(int value) {
        counter += value;

        return counter;
    }
    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }
}
