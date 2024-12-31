package niklase.passthrough;

public class Caller {
    void run() {
        var po = new Forwarder().getObject();
    }
}
