package niklase.passthrough;

public class Forwarder {
    public PassedObject getObject() {
        return new ObjectProvider().getObject();
    }
}
