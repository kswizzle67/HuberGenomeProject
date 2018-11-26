import java.util.Random; 

public class Organism {
	//let's get a private variable (this is called data hiding - the private variables are only accessible from the outside
	//by "accessor" methods or constructors. So we make it private here and then a method to "get" and "set" the values
	
	private String[] genes = new String[36];
	
	//this can hold the characters we want in the object's DNA
    final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWYZabcdefghijklmnopqestuvwxyz";
    final int N = alphabet.length();

	
	//default constructor
	public Organism () 
	{
		//loop and set the inside of the private String genes
		for(int i=0; i<genes.length;i++)
		{
			genes[i]=getGeneValue();
		}
	}
	
	private String getGeneValue() {
		
		//48-122 on the ascii table is 0-9, some special chars, and then lower and upper case Alphabet. 
		//http://www.asciitable.com/
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
       return Character.toString((char) alphabet.charAt(rand.nextInt(N))); 
//demo for Aidan
	}

	public String[] getgenes()
	{
		return genes;
	}

	public void setgenes(String[] x)
	{
		genes = x;
	}
	
	public String getgenesasString()
	{
		StringBuilder builder = new StringBuilder();
		for(String s : genes) {
		    builder.append(s);
		}
		return builder.toString();
		}
}
