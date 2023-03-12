import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
          System.out.println("Student Managment app");
          
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          
          while(true)
          {
        	  System.out.println("Press 1 for addd");
        	  System.out.println("Press 2 for delete");
        	  System.out.println("Press 3 for display of single");
        	  System.out.println("Press 4 for display of all record");
        	  
        	  int c=Integer.parseInt(br.readLine());
        	  
        	  if(c==1)
        	  {
        		  System.out.println("Enter Student name");
        		  String name=br.readLine();
        		
            	  System.out.println("Enter Student city");
            	  String city=br.readLine();
            	  System.out.println("Enter student address");
        		  String address=br.readLine();
        		  Student st=new Student(name,city,address);
        		  boolean f=StudentDao.insert(st);
        		  System.out.print(st);
        		  if(f)
        		  {
        			  System.out.print("Record inserted successfully");
        		  }
        		  else
        		  {
        			  System.out.print("Something went wrong");
        		  }
        		  
        	  }
        	  else if(c==2)
        	  {
        		  System.out.println("Enter Student ID");
        		  int uid=Integer.parseInt(br.readLine());
        		  boolean f=StudentDao.delete(uid);
        		 
        		  if(f)
        		  {
        			  System.out.println("Record deleted successfully");
        		  }
        		  else
        		  {
        			  System.out.print("Something went wrong");
        		  }
        		  
        	  }
        	  else if(c==3)
        	  {
					 System.out.println("Enter Student ID"); 
					 int uid=Integer.parseInt(br.readLine()); 
        		  boolean f=StudentDao.showsingle(uid);
        		 
        		  if(f)
        		  {
        			  System.out.println("Single record displayed successfully");
        		  }
        		  else
        		  {
        			  System.out.print("Something went wrong");
        		  }
        		  
        	  }
        	  
        	  else if(c==4)
        	  {
        		  
        		  boolean f=StudentDao.showall();
         		 
        		  if(f)
        		  {
        			  System.out.println("All record displayed successfully");
        		  }
        		  else
        		  {
        			  System.out.print("Something went wrong");
        		  }
        		  
        	  }
        	  else
        	  {
        		  System.out.println("BYE BYEE");
        	  }
        	  
          }
          
          
	}

}
