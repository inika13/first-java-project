package FileHandlers;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.io.File;
public class main
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
		                  String data = Reader.nextLine();
		                  System.out.println(data);
		              }
		              FileWriter Writer = new FileWriter("myfile.txt");    //WRITE
		              Writer.write("We have successfully completed the course with confidence");
		           }
		          }
		      catch (IOException e) 
		      {
		          e.printStackTrace();
		      }
		  }
		 }

	


