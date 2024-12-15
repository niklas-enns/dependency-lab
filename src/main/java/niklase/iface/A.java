package niklase.iface;

public class A implements HowAShouldLookForB {
    private HowBShouldLookForA howBShouldLookForA;

    void start() {
        howBShouldLookForA.printReport("hello");
    }

    @Override
    public void confirm() {

    }
}
