package LAB_5;

public class D extends C{
    protected String D = "D";
    private X x = new X("YYY");

    public D(){

    }

    public String Print(){
        return super.Print() + x.getX() + D;
    }
}

