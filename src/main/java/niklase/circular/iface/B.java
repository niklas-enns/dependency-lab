package niklase.circular.iface;

public class B implements HowBShouldLookForA {
    public HowAShouldLookForB howAShouldLookForB;

    @Override
    public void printReport(final String report) {
        System.out.println(report);
        howAShouldLookForB.confirm();
    }
}
