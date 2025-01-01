package niklase.circular.iface;

public class A implements HowAShouldLookForB {
    private HowBShouldLookForA howBShouldLookForA;

    void start() {
        howBShouldLookForA.printReport("hello");
    }

    @Override
    public void confirm() {

    }
}
