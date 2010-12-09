package gamejsf.data;

public abstract class GameObject 
{
	private int posX, posY;
	private int speedX, speedY;
	private int sizeX, sizeY;
	
	public GameObject(int posX, int posY, int sizeX, int sizeY)
	{
		this.posX = posX;
		this.posY = posY;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}

	public boolean isCollision(int x, int y)
	{
		if( ( x < posX || x > posX + sizeX) ||
			( y < posY || y > posY + sizeY) )
			return false; // Definately outside
		
		// It is in the boundry box, but is it in the hitbox?
		return isInHitbox(x, y);
	}
	
	protected boolean isInHitbox(int x, int y)
	{
		return false;
	}
	
	public void checkForEnterHitbox (boolean hitbox)
	{
		if()
	}

//picture
//size
//setPosition(100,100);

}
