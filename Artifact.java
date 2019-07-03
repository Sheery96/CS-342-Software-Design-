import java.util.Scanner;

public class Artifact {
	
	private int 	place_id;
	private int 	artifact_id;
	private int 	arti_val;
	private int 	mobility;
	private int 	key_pattern;
	private String  arti_name;
	private String  arti_desc;
	
	Artifact(Scanner sc)
	{
		
		while(sc.hasNextLine())
		{
			
			String line = sc.nextLine();
			
			
			String[] array;
			array = line.split(" ");
			int count = Integer.parseInt(array[0]);
			int des_lin=0;
			
			
			
			this.place_id = count;
			
			
			line = sc.nextLine();
			array = line.split("[ 	//]+");
			
			count = Integer.parseInt(array[0]);
			
			this.artifact_id = count;
			
			
			count = Integer.parseInt(array[1]);
			
			this.arti_val = count;
			
			
			count = Integer.parseInt(array[2]);
			
			this.mobility = count;
			
			count = Integer.parseInt(array[3]);
			
			this.key_pattern = count;
			
			
			this.arti_name = array[4];
			
			line = sc.nextLine();
			
			array = line.split(" ");
			count = Integer.parseInt(array[0]);
			
			
			
			int check=0;
			
			while(check!=count)
			{
				line = sc.nextLine();
				
				this.arti_desc = line;
				check++;
				while(check!=count)
				{
					line = sc.nextLine();
					
					this.arti_desc = this.arti_desc + line;
					check++;
				}
			}
			
			break;
			
			
		}
		
		
		
	}
	
	public int value( )
	{
		return arti_val;
	}
	
	public int size()
	{
		return mobility;
	}
	
	public String name()
	{
		return arti_name;
	}
	
	public String description()
	{
		return arti_desc;
	}
	
	
	public int getId()
	{
		return place_id;
	}
	
	public void use()
	{
		
	}
	
	public void print()
	{
		
	}
	
	
}
