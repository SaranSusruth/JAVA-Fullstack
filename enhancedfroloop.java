 class Student
   {
        int rollno;
        String name;
        int marks;
    }
public class enhancedfroloop
    {
        public static void main(String a[])
            {
               Student s1 = new Student();
               s1.rollno = 1;
               s1.name = "harsh";
               s1.marks = 54;

               Student s2 = new Student();
               s2.rollno = 2;
               s2.name = "hary";
               s2.marks = 92;
               
               Student s3 = new Student();
               s3.rollno = 3;
               s3.name = "shashank";
               s3.marks = 82;

               Student students[] = new Student[3];
               students[0]= s1;
               students[1]= s2;
               students[2]= s3;
               for (Student stud : students)
               {
                 System.out.println(stud.rollno + " " + stud.name + ":" + stud.marks);
               }
               

               
            }
    }   

    

