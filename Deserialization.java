import java.io.*;

public class Deserialization
{
	public static void main(String[] args)
	{
		Employee e;
		try
		{
			FileInputStream file=new FileInputStream("Emp.txt");
			ObjectInputStream in=new ObjectInputStream(file);
			e=(Employee)in.readObject();
			file.close();
			in.close();
			System.out.println("object has been DeSerialized...");
			System.out.println(e.id+" "+e.name+" "+e.salary+" "+e.experience+" "+e.company);
			
			
		}
		catch(Exception e1)
		{
			System.out.println("Exception");
		}
	}
}