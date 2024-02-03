package access.a;

public class AccessData {

    public int publicField;

    int defaultFeild;

    private int privateField;

    public void publicMethod(){
        System.out.println("public Method 호출 " + publicField);
    }

    void defaultMethod(){
        System.out.println("default Method 호출 " + defaultFeild);
    }

    private void privateMethod(){
        System.out.println("private Method 호출 " + privateField);
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultFeild = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
