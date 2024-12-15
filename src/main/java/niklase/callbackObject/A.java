package niklase.callbackObject;

public class A {
    B b = new B();

    public void start() {
        b.printReport("hi", this);
    }

    public void confirm() {

    }
}
