
public class Organism {
	//let's get a private variable (this is called data hiding - the private variables are only accessible from the outside
	//by "accessor" methods or constructors. So we make it private here and then a method to "get" and "set" the values
	
	private String[] genes = new String[36];
	
	//default constructor
	public Organism () 
	{
		//loop and set the inside of the private String genes
		for(int i=0; i<genes.length;i++)
		{
			genes[i]="a";
		}
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
