package LAB_5;

public class C extends B {
    protected String C = "C";

    public C(){

    }

    public String Print(){
        return super.Print() + C;
    }
}
