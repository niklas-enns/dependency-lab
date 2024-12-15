package niklase.intensity;

public class User {

    private ClassThatExposesTooManyDetails classThatExposesTooManyDetails = new ClassThatExposesTooManyDetails();

    void start() {
        classThatExposesTooManyDetails.init();
        var result = classThatExposesTooManyDetails.executeRequest();
        if (result) {
            classThatExposesTooManyDetails.parseResult();
        }
        System.out.println(classThatExposesTooManyDetails.getResponse());
    }
}
