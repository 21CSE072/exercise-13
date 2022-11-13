import java.util.*;
public class studentdetails {
    public static void main(String[] args) {
        int a;
        Scanner obj=new Scanner(System.in);
        Student arr[]=new Student[20];
        System.out.println("enter the no of student:");
        a=obj.nextInt();
        ArrayList<Student> list=new ArrayList<>();
        if (a<=20)
        {
        for(int i=1;i<=a;i++)
        {
            arr[i]=new Student( );
            arr[i].getdata(i,a);
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println("after sorting: ");
        Collections.sort(list, new cgpasort());
        System.out.println(list);
        }
    }
}
class Student
{
    String name;
    String rollno;
    double cgpa;
    void getdata( int i,int num)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter student"+ i +" Name:");
        name=obj.next();
        System.out.println("Enter student " + i+ " Roll number:");
        rollno=obj.next();
        System.out.println("Enter student " + i+" CGPA:");
        cgpa=obj.nextDouble();
    }
    @Override
    public String toString()
            
    {      
        return "\n name :"+ name + "  :: roll no.=" + rollno +  "  :: CGPA=" + cgpa + "\n";
        
    }
    
}

class cgpasort implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return Double.compare(s2.cgpa, s1.cgpa);
    }
}
