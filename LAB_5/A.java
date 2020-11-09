package LAB_5;

public class A {
    protected X x  = new X("XXX");
    protected String A = "A";

    public A(){

    }
    public A(String X){
        x = new X(X);
    }

    public String Print(){
        return x.getX() + A;
    }
}
