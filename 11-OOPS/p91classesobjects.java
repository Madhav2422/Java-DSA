public class p91classesobjects {
    public static void main(String[] args) {
        Pen p1=new Pen(); //Created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setcolor(String Newcolor)
    {
        color=Newcolor;
    }

    void setTip(int stip){
        tip=stip;
    }

    public char[] getcolor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getcolor'");
    }

    public char[] getTip() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTip'");
    }
}

 class Student{
    String name;
    int age;
    float percentage;

    void calcper(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;

    }
 }