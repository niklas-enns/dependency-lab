package niklase.direct;

public class B {
    A a = new A();

    public void printReport(final String report) {
        System.out.println(report);
        this.a.confirm();
    }
}
