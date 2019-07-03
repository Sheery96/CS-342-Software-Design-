import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameTester 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		
		System.out.println("  Name: Fnu Nousheerwan");
		System.out.println("  Net Id: fnoush2");
		
		
		/*System.out.println(System.getProperty("user.dir"));*/
		
		System.out.print("  Enter filename with extension: ");
		Scanner input = new Scanner(System.in);
		
		
		String str = input.nextLine();
		if(str.equals("quit"))
		{
			return;
		}
		
		File file = new File(str);
		while (file.exists()!=true)
		{
			
			
				System.out.println("  File Not Present ");
				System.out.print("  Enter a correct filename with extension: ");
				input = new Scanner(System.in);
				str = input.nextLine();
				if(str.equals("quit"))
				{
					break;
				}
				
				file = new File(str);
			
		
		}
		
		if (file.exists() == true)
		{
		
			input = new Scanner(file);
		
			if (input.hasNextLine())
			{
				System.out.println("  File Opened ");
			}
			
			Game game = new Game(input);
			//game.play();
		
		   input.close();
		
		}
		
		

   }
}
