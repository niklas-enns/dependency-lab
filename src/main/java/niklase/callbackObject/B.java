package niklase.callbackObject;

public class B {

    public void printReport(final String report, final A a) {
        System.out.println(report);
        a.confirm();
    }
}
