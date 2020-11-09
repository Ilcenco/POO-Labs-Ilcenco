package LAB_5;

public class B extends A{
    protected String B = "B";

    public B(){

    }

    public String Print(){
        return super.Print() + B;
    }
}
