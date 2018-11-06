
import java.util.ArrayList;


public class Genome {

	static ArrayList<Organism> ecosystem;
	
	public static void main(String[] args) { 
	//System.out.println("Kristin was here");

	//in here we should do the following:
	//1. Set any constants. Perhaps accept the variables we want from the user.
	//2. Obviously start creating objects.
	//3. Keep track of those objects
	//4. Figure out how long to run (does the user send this in?)
	//5. Report out the results
	
	//So the objects will all go into another .java. This will just be a class that can be instantiated. This means we have to create that object. 
	//That object will take up memory, but since it is just 36 characters or so it wont take up much memory for each object (each char is 4 bytes?
	//Where do we store those objects?
	//We create one and then throw it into the array.
	//That array is our population.
	//Then the objects need to die (they have a life right?)
	//Should we define the life by generations? Perhaps once the object spawns other objects it 
		
		//set ecosystem to have one element
		ecosystem = new ArrayList<Organism>();
		
		//let's loop for 1000
		for(int i=0;i<1000;i++)
		{
			ecosystem.add(new Organism());	
		}
		
		for(Organism e:ecosystem)
		{
			System.out.println(e.getgenesasString());
		}
		
	}

}
