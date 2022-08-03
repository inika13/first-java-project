 package FileHandlers;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class SampleFile {
public static void main(String[] args)
		 {

		     try {
		         File Obj = new File("myfile.txt");
		         if (Obj.createNewFile()) {// CREATE
		             System.out.println("File created: "+ Obj.getName());
		         }
		         else
		         {
		        Scanner Reader = new Scanner(Obj);   //READ
		             while (Reader.hasNextLine())
		             {
		                 String data = Reader.nextLine();
		                 System.out.println(data);
		             }
		             FileWriter Writer = new FileWriter("myfile.txt");    //WRITE
		             Writer.write("We have successfully completed the course with confidence");
		          }
		         }
		     catch (IOException e) {
		         e.printStackTrace();
		     }
		 }
		}
		
		
		
		
		
		for(String str:ZoneId.)
	

	}

}
