package q.pkg2generic;

class Box<T> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericExample {

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println("Integer value: " + intBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello ");
        System.out.println("String value: " + stringBox.getItem());
    }
}
