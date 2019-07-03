import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Place {
	
	private int  ID;
	private String name;
	private String Description;
	
	private static TreeMap<Integer,Place> tmap = new TreeMap<Integer, Place>();
	public ArrayList<Direction> list1 = new ArrayList<Direction>();
	private ArrayList<Artifact> list = new ArrayList<Artifact>();
	
	Place (Scanner sc)
	{
		while(sc.hasNextLine())
		{
				
			String line ;
			
			String[] array;
			
				line = sc.nextLine();
				array = line.split("[// ,	]+");
				
				if (array.length==1)
				{
					
					while (true)
					{
						line = sc.nextLine();
						array = line.split("[// ,	]+");
					
						if (array.length==1 || array[0].equals("DIRECTIONS")==true)
						{
							break;
						}
					}
					
				 
					if (array[0].equals("DIRECTIONS")!=true)
					{
						line = sc.nextLine();
						array = line.split("[// ,	]+");
					}
					else
					{
						if (array[0].equals("DIRECTIONS")==true)
						{
							
							break;
						}
						
					}
				}
				
				int count = Integer.parseInt(array[0]);
				 
				this.ID = count;
				this.name = array[1]+" "+ array[2];
				tmap.put(this.ID, this);
				
				line = sc.nextLine();
				array = line.split(" ");
				count = Integer.parseInt(array[0]);
				int i=0;
				
				while(i!=count)
				{
					line = sc.nextLine();
					
					this.Description = line;
					i++;
					while(i!=count)
					{
						line = sc.nextLine();
						
						this.Description = this.Description+line;
						i++;
					}
					
				}
				
			
			  
			  break;
			}
		 
	    }
			
	
	
	public int getID()
	{
		return ID;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public String get_description()
	{
		return Description;
	}
	
	
	public void addArtifact(Artifact a)
	{
		
		
	}
	
	public static Place getPlaceByID(int p)
	{
		if (tmap.containsKey(p))
		{
			return tmap.get(p);
		}
		else
		{
			return null;
		}
	}
	
	public void useKey(Artifact ar)
	{
		
	}
	
	public void print()
	{
		
		System.out.println(" Your Current Location is: " + this.get_name());
		System.out.println(" From your current Location " + this.get_description());
		System.out.println("\n");
		
		
	}
	
	
	public void add_Direction(Direction d)
	{
		list1.add(d);
	}
	
	
	
	public Place followDirection(Place p,String ch)
	{
		
		for (int i=0;i<p.tmap.size();i++)
		{
			for(int s=0;s<p.list1.size();s++)
			{
				
				if (p.tmap.containsKey(p.getID()))
				{
					
					return p.tmap.get(p.getID());
				}
				
				
			}
			
			
		}
		
		return this;
	}
	
	


}
