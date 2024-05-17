package Stacks;

public class Main {

    public static void main(String[] args) {
        ArraysImplementation.implementation arrayImpl = new ArraysImplementation.implementation();
        arrayImpl.push(10);
        arrayImpl.push(20);

        System.out.println(arrayImpl.pop());
        System.out.println(arrayImpl.top());
    }

}
