class Student
{
    int rollno;
    String name;
    int marks;
}

public class objects_of_array 
{
    public static void main(String args[])    
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Vinay";
        s1.marks = 87;

        Student s2 = new Student();
        s2.rollno = 2;
        // s2.name = "kiran";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sai";
        // s3.marks = 67;

        Student st[] = new Student[3];

        st[0] = s1;
        st[1] = s2;
        st[2] = s3;

        for(int i=0; i<st.length; i++)
        {
            System.out.println(st[i].name+ " : "+st[i].marks);
        }

        int nums[] = new int[4];

        for(int n : nums)
        {
            System.out.println(n);
        }

        for(Student stud : st)
        {
            System.out.println(stud.name + ":" + stud.rollno);
        }
    }
}
