package niklase.callbackLambda;

public class B {
    public void printReport(final String hello, final Runnable aGotConfirmation) {
        aGotConfirmation.run();
    }
}
