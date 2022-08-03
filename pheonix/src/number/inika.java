package number;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Date;
import java.time.*;

public class inika 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
	         File Obj = new File("myfile.txt");
	         if (Obj.createNewFile()) 
	         {// CREATE
	             System.out.println("File created: "+ Obj.getName());
	         }
	         else
	         {
	        Scanner Reader = new Scanner(Obj);   //READ
	        
	             while (Reader.hasNextLine())
	             {
	            	 String name=Reader.next();
	            	 String data = Reader.next();
	            	 if(Pattern.matches("[7-9]{1}[0-9]{9}",data)) 
	            {
	                 System.out.println(data);
	                 File obj1=new File(name+".txt");
	                 if(obj1.createNewFile())
	                 {
	                	 System.out.println("created");
	                 }
	                 else
	                 {
	                	 Calendar c = Calendar.getInstance();
	                	 Date time = c.getTime();
	                	 FileWriter Writer
	                	 = new FileWriter(name+".txt");
	                	 Writer.write(time.toString());
	                	 Writer.close();
	                 }
	             }
	             
	          }
	             Reader.close();
	         }
		}
	     catch (IOException e) 
		{
	         e.printStackTrace();
	}

}
}


