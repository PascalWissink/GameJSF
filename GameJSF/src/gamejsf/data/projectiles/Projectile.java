package gamejsf.data.projectiles;

import gamejsf.data.GameObject;

public abstract class Projectile extends GameObject
{
	protected int damage;
	protected boolean homing;
	
	public Projectile(int damage, boolean homing)
	{
		this.damage = damage;
		this.homing = homing;
	}
	
}
