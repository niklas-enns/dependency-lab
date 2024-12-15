package niklase.callbackLambda;

public class A {
    B b = new B();
    public void start() {
        b.printReport("hello", () -> {
            System.out.println("A got confirmation");
        });
    }
}
