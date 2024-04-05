public class p95copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Madhav";
        s1.no = 11;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;


        Student s2 = new Student(s1);
        System.out.println("Name " + s2.name + "Roll No " + s2.no);
        s1.marks[2]=100;
        
        for(int i=0;i<=3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    int no;
    String name;
    int marks[];

    // Shallow Copy constructor
    // Student(Student s1) {
    //     marks=new int[3];
    //     this.name = s1.name;
    //     this.no = s1.no;
    //     this.marks=s1.marks;
    // }

    //Deep copy Constructor
    Student(Student s1){
        marks=new int[3];
        this.name = s1.name;
        this.no = s1.no;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }


    Student(int no, String name) {
        marks=new int[3];
        this.name = name;
        this.no = no;

    }
    Student()
    {
        marks=new int[3];
        System.out.println("Constructor is called");
    }
}
