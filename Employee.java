import java.util.*;
public static empid,ename,leaves;
public class Employee

{
    Employee(){}
    Employee(Hashtable<String,Employee>x)
      {
        Scanner sc=new Scanner(System.in);
        int rep;
        do{
                           System.out.println("Enter Employee number:");
                           int eid=sc.nextInt();
                           System.out.println("Enter  Employee name:");
                          String name=sc.next();
                          System.out.println("Enter  number of leaves wanted:");
                          int lvs=sc.nextInt();
                       

                          Employee e=new Employee(eid,name,lvs);
                          x.put(e.getname(),e);
                          System.out.println("Enter 1 to put 0 to exit");
                          rep=sc.nextInt();
           } while(rep!=0);

        }
    Employee(int eid,String name,int lvs)
     { 
            empid=eid;
            ename=name;
            leaves=lvs;
             
     }
    public String getname()
       {
           return name;
       }
    
    public double getLeaves()
     {
         return leaves;
     }
    public int getId()
     {
         return empId;
     }
    public void setLeaves(int l)
     {
         leaves=l;
     }
    public String toString()
     {
         return empid+" ||"+ename+"|| "+leaves+" ||;
     }
}
class Assignment
{
    public static void main(String args[])
    {
        Employee demo;
        Scanner sc=new Scanner(System.in);
        Hashtable<String,Employee>x=new Hashtable<String,Employee>();
        
        
        do{ System.out.println("Enter Choice");
                System.out.println("------------");
                System.out.println("1:View Applied Leaves");
                System.out.println("2:Apply For Leave");
                System.out.println("3:Cancel Leave");
                System.out.println("4:View Summary");
                System.out.println("0:EXIT");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                           Enumeration<Employee> e=x.elements();
		           while(e.hasMoreElements())
		           {
										    Employee d=e.nextElement();
										    System.out.println(d);
		           }
		           break;
		    case 2:
		              Employee test=new Employee();
		              System.out.println("Enter ID");
		              String s1=sc.nextline();
		              test.get(s1);
                               System.out.println("Enter the number of leaves you want");
                               int l=sc.nextInt();
                               
                               
                            }
                        }
                    }
                }