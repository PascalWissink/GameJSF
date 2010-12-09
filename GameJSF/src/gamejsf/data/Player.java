package gamejsf.data;


public class Player extends GameObject
{
public int Lifes;
public int health;
public int Shield;
private World world;

	public Player(World thegame)
	{
		world = thegame;
		Lifes = 3;
		health = 100;
		Shield = 5;
	}
	
	protected boolean isInHitbox(int x, int y)
	{
		return true;
	}

}
