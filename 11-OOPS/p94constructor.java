public class p94constructor {
    public static void main(String[] args) {
        Student s1=new Student("Madhav");
        System.out.println(s1.name);
        System.out.println(s1.no);

    }
}
class Student{
    int no;
    String name;

        // Paramterized Constructor
    Student(String name)
    {
        this.name=name;

        no=3; //Non parametrized Constructor
    }
}
