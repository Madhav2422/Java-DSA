public class p49arrayasargument {

    public static void update(int marks[],int nonchange){
        nonchange=20;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={98,99,97};
        int nonchange=3;
        update(marks,nonchange);
        System.out.println("Noon" + nonchange);

        // print our marks
        for(int i=0;i<marks.length;i++)
        {
           System.out.print("Marks  " +marks[i]);
        }
        System.out.println();
    }
}
