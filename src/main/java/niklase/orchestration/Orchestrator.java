package niklase.orchestration;

public class Orchestrator {
    void start() {
        var c1Data = new C1().getData();
        var c2Data = new C2().getData(c1Data);
        new C3().sendResult(c2Data);
    }
}
