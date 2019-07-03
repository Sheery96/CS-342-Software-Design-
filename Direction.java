import java.util.*;


public class Direction 
{
	private int ID;
	private Place from;
	private Place to;
	private int lockPattern;
	private String lock_status;
	private DirType d;
	
	
	
	
	Direction(Scanner sc)
	{
		
		while (sc.hasNextLine())
		{
			String line = sc.nextLine();
			String[] array;
			array = line.split("[	 //]+");
			int count,from_id,to_id;
			
			if (array.length!=1 && array[5].equals("0")!=true && array[5].equals("version")!=true)
			{
				/*System.out.println("In the Direction loop array[0]: " + array[5]);*/
				/*System.out.println("In the Direction loop: " + line);*/
				/*System.out.println(array[1]+array[1]);*/
				///// Adding From and To Places according to Direction //////////
				count = Integer.parseInt(array[1]);
				
				from_id = count;
				
				
				count = Integer.parseInt(array[3]);
				to_id = count;
				
				
				this.from = this.from.getPlaceByID(from_id);
				this.to = this.to.getPlaceByID(to_id); 
				
				////////////////////////////////////////////////////////////////
				
				
				/////////////////// Assigning the Appropriate ID /////////////////
				count = Integer.parseInt(array[0]);
				this.ID = count;
				
				////////////////////////////////////////////////////////////////
				
				/////////////////////// Working on the ENUM ///////////////////
				
				
				this.d = this.d.valueOf(array[2]);
				
				////////////////////////////////////////////////////////////////
				
				/////////////////////// Locking and Unlocking /////////////////
				this.lock_status = "unlocked";
				
				///////////////////// Lock Pattern ///////////////////////////
				count = Integer.parseInt(array[4]);
				
				
				if (count !=0)
				{
					this.lock_status="locked";
				}
				
				////////////////////////////////////////////////////////////////
				
				break;
				
			}
			
			
		}
		
		
		
		
	}
	
	// Private Enum Class inside the direction class
	private enum DirType{
		
		NONE("None","None"),N("North","N"),S("South","S"),E("East","E"),W("West","W"),U("Up","U"),D("Down","D"),NE("North-East","NE"),
		NW("North-West","NW"),SE("South-East","SE"),
		SW("South-West","SW"),NNE("North-Northeast","NNE"),NNW("North-Northwest","NNW"),ENE("East-Northeast","ENE"),WNW("West-Northwest","WNW"),
		ESE("East-Southeast","ESE"),WSW("West-Southwest","WSW"),SSE("South-Southeast","SSE"),SSW("South-Southwest","SSW");
		
		private final String text;
		
		private final String abbreviation;
		
		DirType(String t, String a)
		{
			this.text = t;
			this.abbreviation = a;
		}
		
		public String to_String()
		{
			return text;
			
		}
		
		public String get_abbreviation()
		{
			return abbreviation;
		}
		
		public boolean match(String s)
		{
			if (s.equals(text) || s.equals(abbreviation))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}
	
	public String ret_d(String s)
	{
		if(this.d.match(s))
		{
			return this.d.text;
		}
		else
		{
			return null;
		}
	}
	
	public void print ()
	{
		
	}
	
	public int getID()
	  {
		  return ID;
	  }
		
	  public Place getfrom()
	  {
		  return from;
	  }
	  
	  public Place getto()
	  {
		  return to;
	  }
	  
	 
	
	  public void lock()
	  {
		  lock_status = "locked";
	  }
		
	  public void unlock()
	  {
		  lock_status = "unlocked";
	  }
		
	  public boolean isLocked()
	  {
		  if (lock_status == "unlocked")
		  {
			  return true;
		  }
		  
		  else
		  {
			  return false;
		  }
		  
		  
	  }
	  
	
}
