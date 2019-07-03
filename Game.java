import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game 
{
	private String game_n;
	private ArrayList<Place> list = new ArrayList<Place>();
	private static Place Current_Place;
	
	Game(Scanner scan)
	{
		//////////////////////////////////// Reading and Working on Places ////////////////////////////////////////
		while(scan.hasNext())
		{
			
			if (scan.next().equals("PLACES"))
			{
				break;
			}
			else
			{
				String line = scan.nextLine();
				String[] array;
				array = line.split("[ //]+");
					
				
				game_n = array[2]+" "+array[3];
				
			}
		}
		
			System.out.println("  "+game_n);
			
			String line = scan.nextLine();
			String[] array;
			array = line.split("[ 	//]+");
			int count = Integer.parseInt(array[1]);
			
			int i = 0;
			Place[] place = new Place[count];
			
			while (i!=count-1)
			{
				while (scan.hasNext())
				{
					
					line = scan.nextLine();
					
				
					array = line.split("[// ,]+");
					
					if (array.length==1)
				 {
						
					place[i] = new Place(scan);
					list.add(place[i]);
				
					if(i==0)
					{
						this.Current_Place = place[i];
					}
				
				 	i++;
				 	
				 		if(i==14)
				 		{
				 			break;
				 		}
				 	
				  }
				}
				if(i==14)
		 		{
		 			break;
		 		}
			
			}
			
			
			///////////////////// Reading and Working On Directions ///////////////////////
			int j=0;
			
			
			while (scan.hasNextLine())
			{
				
				String line1 = scan.nextLine();
				String[] array1;
				array1 = line1.split("[ 	//]+");
	
				if (array1.length==1 && j!=2)
				{
					j++;
				}
				
				else
				{
					
					
					array1 = line1.split("[ 	//]+");
					int count1 = Integer.parseInt(array1[1]);
					
					int d_count=0,k=0,from_id=0,to_id=0;
					
					Direction[] dir = new Direction[count1];
					
					
					while (d_count != count1)
					{
						if(d_count==0)
						{
							line1 = scan.nextLine();
							array1 = line1.split("[ 	//]+");
						}
						
						if(k!=2)
						{
							
							k++;
						}
						else
						{
							
							dir[d_count] = new Direction(scan);
							
							d_count++;
							
							
							
						}
					}
					
					int counter=0;
					for(int g=0;g < list.size();g++)
					{
						
							while(counter!=count1-1)
						 {		
							if(list.get(g).getID()==dir[counter].getfrom().getID())
							{
								
								
								counter++;
								list.get(g).add_Direction(dir[counter]);
							}
							else
							{
								counter++;
							}
						 }
							
							counter=0;
							
						
						
						
					}
					
					
					
					break;
				}
				

				
			}
				
			//////////////////////////////////////////////////////////////////////////////////////////////////
			
			//////////////////////////////// Reading and Working on Artifacts ///////////////////////////////
			
			
			int k1=0;
			
			while (scan.hasNextLine())
			{
				
				String line1 = scan.nextLine();
				String[] array1;
				array1 = line1.split("[ 	//]+");
			
				if (array1.length==1 && k1!=2)
				{
					k1++;
				}
				
				else
				{
					
					
					array1 = line1.split("[ 	//]+");
					int count1 = Integer.parseInt(array1[1]);
					
					int a_count=0,k=0,pla_id=0,art_id=0,art_val,art_mob,art_patt;
					String art_nam;
					
					Artifact[] art = new Artifact[count1];
					
					
					while (a_count != count1)
					{
						
						if(k!=1)
						{
							line1 = scan.nextLine();
							array1 = line1.split("[ 	//]+");
							k++;
							
						}
						
						
						else
						{
							
							art[a_count] = new Artifact(scan);
							
							for(int h=0;h<list.size();h++)
							{
								if(place[h].getID()==art[a_count].getId())
								{
									place[h].addArtifact(art[a_count]);
								}
								
							}
							
							a_count++;
							line1 = scan.nextLine();
						}
						
					}
					break;
				}
				

				
				
			}
			
			
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			
				
	}
	
	
	public static Place getCurrentPlace()
	{
		
		return Current_Place;
	}
	
	
	
	
	public void print()
	{
		System.out.println("*************************************************");
		System.out.println("            *Welcome To Six Rooms*");
		System.out.println("*************************************************");
		
		System.out.println(" ------------------ GAME ROOMS ----------------- ");
		
		System.out.println("       ________________________________ N        ");
		System.out.println("       |                               |         ");
		System.out.println("       V                               |         ");
		System.out.println(" *************                ****************** ");
		System.out.println(" Ogre's Lair    ----------->      Treasure Room   ");
		System.out.println(" ****  ^ *****       E        ****** ^ | ********");
		System.out.println("     | |                             | |         ");
		System.out.println("   S | | N                        LN | |  S      ");
		System.out.println("     | |                             | |         ");
		System.out.println("     V |                             | V         ");
		System.out.println(" *************       E        ******************** ");
		System.out.println("Entrance Hall  ----------->  Pool  Of Enchantment ");
System.out.println("EXIT<--w--From E Hall                                     ");
        System.out.println("Entrance Hall  <----------   Pool  Of Enchantment ");
		System.out.println(" *************       W        *********************");
		System.out.println(" ****  ^ *****                *******  | ********");
		System.out.println("     | |                               |         ");
		System.out.println("  D  | | U                             |D        ");
		System.out.println("     | |                               |         ");
		System.out.println("     V |                               V                                 | ");
		System.out.println(" *****************        W      ********************          LE        | ");
		System.out.println(" Potions StoreRoom  <-----------   Potions Lab           ------------->  | ");
		System.out.println(" Potions StoreRoom  ----------->   Potions Lab                           | ");
		System.out.println(" *****************        LE     ********************");
		
		
		
		System.out.println(" ------------------ GAME ROOMS ----------------- ");
		System.out.println("\n");
		
		
	}
	
	
	
	public void play()
	{
		System.out.println("\n");
		System.out.println("\n");
		
	
		int i=0;
		Place current;
		
		
		
		
		System.out.println("Welcome to the Game 'Mystic City' ");
		System.out.println("\n");
		print();
		System.out.println("User Enter 'LOOK' To See Your Current Location");
		System.out.println("User Enter directions where possible directions are"
				+ "N,S,E,W,U,D,NE,SE,SW,NNE,NNW,SSE,SSW,ENE,ESE,WNW,WSW");
		System.out.println("User Enter 'GET-artifact'");
		System.out.println("User Enter 'DROP-artifact'");
		System.out.println("User Enter 'Use-artifact'");
		System.out.println("User Enter 'INVE or INVENTORY'");
		System.out.println();
		System.out.print("User Enter Your Choice: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		
		while(true)
		{
			if (str.equals("EXIT") || str.equals("QUIT") || str.equals("1"))
			{
				break;
			}
			
			else
			{
			
				if (str.equals("LOOK"))
				{
					current = getCurrentPlace();
					current.print();
					
				
				}
				
				if (str.equals("GET-artifact"))
				{
					current = getCurrentPlace();
				}
				
				if (str.equals("DROP-artifact"))
				{
					current = getCurrentPlace();
				}
				
				if (str.equals("Use-artifact"))
				{
					current = getCurrentPlace();
				}
				
				
				if (str.equals("INVE") || str.equals("INVENTORY") )
				{
					current = getCurrentPlace();
				}
			
			else 
			{
				////////////////////////////////// All North Directions //////////////////////////////////////////
				
				
				if (str.equals("N") || str.equals("North") || str.equals("NORTH") || 
				 str.equals("north") || str.equals("GO-N") || str.equals("GO-North") || 
				 str.equals("GO-NORTH") || str.equals("GO-north"))
				{
					/*System.out.println(" Here bhaii ");*/
					current = getCurrentPlace();
					current = current.followDirection(current,"N");
					current.print();
					
				}
				
				if (str.equals("NE") || str.equals("North-East") || str.equals("NORTH-EAST") || 
					str.equals("north-east") || str.equals("GO-NE") || str.equals("GO-North-East") || 
					str.equals("GO-NORTH-EAST") || str.equals("GO-north-east"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"NE");
					current.print();
				}
				
				if (str.equals("NW") || str.equals("North-West") || str.equals("NORTH-WEST") || 
					str.equals("north-west") || str.equals("GO-NW") || str.equals("GO-North-West") || 
					str.equals("GO-NORTH-WEST") || str.equals("GO-north-west"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"NW");
					current.print();
				}
				
				if (str.equals("NNE") || str.equals("North-NorthEast") || str.equals("NORTH-NORTHEAST") || 
					str.equals("north-northeast") || str.equals("GO-NNE") || str.equals("GO-North-NorthEast") || 
					str.equals("GO-NORTH-NORTHEAST") || str.equals("GO-north-northeast"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"NNE");
					current.print();
								
				}
				
				
				if (str.equals("NNW") || str.equals("North-NorthWest") || str.equals("NORTH-NORTHWEST") || 
					str.equals("north-northwest") || str.equals("GO-NNW") || str.equals("GO-North-NorthWest") || 
					str.equals("GO-NORTH-NORTHWEST") || str.equals("GO-north-northwest"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"NNW");
					current.print();
									
				}
				
				/////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				////////////////////////////////////////////// All South Directions /////////////////////////////////////
				
				
				if (str.equals("S") || str.equals("South") || str.equals("SOUTH") ||
					str.equals("south") || str.equals("GO-S") || str.equals(" GO-South") || 
					str.equals("GO-SOUTH") || str.equals("GO-south") )
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"S");
					current.print();
				}
				
				if (str.equals("SE") || str.equals("South-East") || str.equals("SOUTH-EAST") || 
					str.equals("south-east") || str.equals("GO-SE") || str.equals("GO-South-East") || 
					str.equals("GO-SOUTH-EAST") || str.equals("GO-south-east"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"SE");
					current.print();
								
				}
					
					if (str.equals("SW") || str.equals("South-West") || str.equals("SOUTH-WEST") || 
					str.equals("south-west") || str.equals("GO-SW") || str.equals("GO-South-West") || 
					str.equals("GO-SOUTH-WEST") || str.equals("GO-south-west"))
				{
						current = getCurrentPlace();
						current = current.followDirection(current,"SW");
						current.print();
				}
					
					if (str.equals("SSE") || str.equals("South-SouthEast") || str.equals("SOUTH-SOUTHEAST") || 
						str.equals("south-southeast") || str.equals("GO-SSE") || str.equals("GO-South-SouthEast") || 
						str.equals("GO-SOUTH-SOUTHEAST") || str.equals("GO-south-southeast"))
				{
						current = getCurrentPlace();
						current = current.followDirection(current,"SSE");
						current.print();
									
				}
					
					
					if (str.equals("SSW") || str.equals("South-SouthWest") || str.equals("SOUTH-SOUTHWEST") || 
						str.equals("south-southwest") || str.equals("GO-SSW") || str.equals("GO-South-SouthWest") || 
						str.equals("GO-SOUTH-SOUTHWEST") || str.equals("GO-south-southwest"))
				{
						current = getCurrentPlace();
						current = current.followDirection(current,"SSW");
						current.print();
				}
					
					
					/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				   ///////////////////////////////////////// All Directions of East
					
				if (str.equals("E") || str.equals("East") || str.equals("EAST") || 
					str.equals("east") || str.equals("GO-E") || str.equals("GO-East") || 
					str.equals("GO-EAST") || str.equals("GO-east") )
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"E");
					current.print();
				}
				
				if (str.equals("ENE") || str.equals("East-NorthEast") || str.equals("EAST-NORTHEAST") || 
					str.equals("east-northeast") || str.equals("GO-ENE") || str.equals("GO-East-NorthEast") || 
					str.equals("GO-EAST-NORTHEAST") || str.equals("GO-east-northeast"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"ENE");
					current.print();
									
				}
					
					
				if (str.equals("ESE") || str.equals("East-SouthEast") || str.equals("EAST-SOUTHEAST") || 
					str.equals("east-southeast") || str.equals("GO-ESE") || str.equals("GO-East-SouthEast") || 
					str.equals("GO-EAST-SOUTHEAST") || str.equals("GO-east-southeast"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"ESE");
					current.print();
				}
				
				
				
				//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				
				////////////////////////////////////////// All Possible Directions of WEST //////////////////////////////////////////
				
				
				if (str.equals("W") || str.equals("West") || str.equals("WEST") || 
					str.equals("west") || str.equals("GO-W") || str.equals("GO-West") || 
					str.equals("GO-WEST") || str.equals("GO-west") )
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"W");
					current.print();
					
				}
				
				
				if (str.equals("WNW") || str.equals("West-NorthWest") || str.equals("WEST-NORTHWEST") || 
					str.equals("west-northwest") || str.equals("GO-WNW") || str.equals("GO-West-NorthWest") || 
					str.equals("GO-WEST-NORTHWEST") || str.equals("GO-west-northwest"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"WNW");
					current.print();
										
				}
				
				if (str.equals("WSW") || str.equals("West-SouthWest") || str.equals("WEST-SOUTHWEST") || 
					str.equals("west-southwest") || str.equals("GO-WSW") || str.equals("GO-West-SouthWest") || 
					str.equals("GO-WEST-SOUTHWEST") || str.equals("GO-west-southwest"))
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"WSW");
					current.print();
				}
				
				
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				///////////////////////////////////////////// UP and DOWN Directions ////////////////////////////////////////////////
				
				if (str.equals("U") || str.equals("Up") || str.equals("UP") ||
					str.equals("up") || str.equals("GO-U") || str.equals("GO-Up") || 
					str.equals("GO-UP") || str.equals("GO-up") )
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"U");
					current.print();
					
				}
				
				if (str.equals("D") || str.equals("Down") || str.equals("DOWN") || 
					str.equals("down") || str.equals("GO-D") || str.equals("GO-Down") || 
					str.equals("GO-DOWN") || str.equals("GO-down")  )
				{
					current = getCurrentPlace();
					current = current.followDirection(current,"D");
					current.print();
				}
				
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				
				///////////////////////////////////////////// New Commands //////////////////////////////////////////////////////////
			
			}
			
			
		 }
			System.out.println("User Enter Your Choice: ");
			Scanner input1 = new Scanner(System.in);
			str = input1.next();
			
			
		
		 }
	  }
	
	
	}
	
	



