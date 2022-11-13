
import java.util.*;     
public class collection  
{  
public static void main(String args[])   
{  
int sum = 0, avg;      
ArrayList<Integer> list = new ArrayList<Integer>();    
list.add(120);  
list.add(230);  
list.add(100);  
list.add(100);  
list.add(100);
list.add(100);
list.add(50);
list.add(50);
list.add(50);
list.add(50);
list.add(30);
list.add(30);
for(int i = 0; i < list.size(); i++)  
sum = sum + list.get(i);   
avg = sum / list.size();   
System.out.print("---TELEPHONE BILL AMOUNT---");
System.out.println("\n The average telephone bill in the year is: " + avg);  
 int min = list.get(0);
 int max = list.get(0);
        int n = list.size();
        for (int i = 1; i < n; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum telephone bill is : " + max);
        System.out.println("least telephone bill is : " + min);
    }
}


