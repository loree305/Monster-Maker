/* Lauren Cameron*/


public class Monster
{
	//Variables
	private String monsterName;
	private String monsterFur;
	private int level;
	private String monsterEye;
	private String monsterSize;
	
	
	
	//Constructor
	public Monster (String fur, int level,String namer, String eyeColor, String mSize )
	{
		monsterFur = fur;
		levelUp = level;
		monsterName = namer;
		monsterEye = eyeColor;
		monsterSize = mSize;
		
	}
	
	//Getter method for the monster object
	public String getFur()
	{
		return monsterFur;
	}
	
	public String getNamer()
	{
		return monsterName;
	}
	
	public String getEyecolor()
	{
		return monsterEye;
	}
	
	public String getMsize()
	{
		return monsterSize;
	}

	//possible fix
	public String getlevel()
	{
		return level;
	}
	
	//Setter methods for the monster object
	public void setFur(String newfur)
	{
		monsterFur=newFur;
	}
	
	public void setNamer()
	{
		monsterName=namer;
	}
	public void setEyecolor()
	{
		monsterEye = eyeColor;
	}
	
	public void setMsize()
	{
		monsterSize = msize;
	}
	
	//Setter method to updated 
	//Monster levels up
	public void levelUp()
	{
		level++;
	}
}