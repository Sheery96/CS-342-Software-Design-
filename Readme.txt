Author: Fnu Nousheerwan
Netid:  fnoush2
Code#:	3421
File:	Readme.txt
Desc:	Readme file for CS 342 Fall 2018 Program 2: "Mystic City 3.1"

Starting and Running the program: 
		1. Unzip the folder into the desired directory.
		2. Make sure the compiler e.g. ubash or any other compiler is in the "src" directory of the program (/Users/TA/Desktop/fnoush2_Project2/src).
		3. Now, on the command prompt type "make" and it will take care of all the targets and dependencies.
                4. Now, type "java GameTester" and it will run the program.  
		5. My Program is running fine on Eclipse but not on Ubash.

Description of my program: My program does all the required steps
	Completion:
		1. Direction Class has all the required methods and data members as mentioned in the hw. Constructor is present 
                 to initialize the objects of the class using scanner object. Data members are private and can only be accessed via getters. 
		2. Place Class has all the required methods and data members.Constructor is present 
                 to initialize the objects of the class using scanner object. Data members are private and can only be accessed via getters.
		3. Game Class has a print method() which shows the "graphical representation" of the game rooms. It also has the play() method 
                with all the required functionalities to run the game. However, the representation does not include the new rooms due to time
		constraints. Scanner in the game class constructors calls all the other constructors.
		4. Game Tester Class reads in the file and check for any file issues and then calls the game class.
		5. Artifacts class does all the file parsing. 

		Note: My code does all the file parsing correctly and stores all the required places, directions and artifacts. 
		