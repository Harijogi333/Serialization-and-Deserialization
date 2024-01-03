import java.io.Serializable;
import java.io.*;
class Employee implements Serializable
{
	int id;
	String name;
	int salary;
	static String company="TCS";
	transient int experience;
}
public class Serialization
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.id=1;
		e.name="Hari";
		e.salary=20000;
		e.experience=6;
		try
		{
			FileOutputStream file=new FileOutputStream("Emp.txt");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(e);
			file.close();
			out.close();
			System.out.println("object has been Serialized...");
		}
		catch(Exception e1)
		{
			System.out.println("Exception");
		}
	}
}
			
			
	
