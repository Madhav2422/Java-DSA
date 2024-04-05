public class p93getterssetters {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());

        p1.settip(5);
        System.out.println(p1.getTip());
    }
}

class pen {
   private String color;
   private int tip;

    String getcolor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // Setters
    void setcolor(String color) {
        this.color = color;
    }

    void settip(int tip) {
        this.tip = tip;
    }
}