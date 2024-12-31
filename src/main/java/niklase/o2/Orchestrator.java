package niklase.o2;

public class Orchestrator {
    void start() {
        var c1Data = new C1().getData();
        var c2Data = new C2().getData(c1Data);
    }

    public class C1Response {
    }

    public class C2Response {
    }
}
