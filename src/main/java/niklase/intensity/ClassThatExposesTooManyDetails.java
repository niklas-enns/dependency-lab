package niklase.intensity;

public class ClassThatExposesTooManyDetails {

    private String response;
    private byte[] rawResponse;

    public void init() {
    }

    public boolean executeRequest() {
        this.rawResponse = new byte[10];
        return true;
    }

    public void parseResult() {
        this.response = new String(rawResponse);
    }

    public String getResponse() {
        return this.response;
    }

}
