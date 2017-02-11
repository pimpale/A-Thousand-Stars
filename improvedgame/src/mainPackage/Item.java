package mainPackage;

import java.awt.Image;

public class Item {
	public String Name = null;
	public String Description = null;
	public String Type = null;
	public Image Sprite = null;
	
	//generator
	//generators generate power for the ship. They are needed by weapons, thrusters, and shields
	public double PowerGenerated;//the points of power generated each tick
	public double CurrentPower;//the current amount of power stored
	public double MaxPower;//the max amount of power stored by the generator
	
	//shield
	//shields absorb some percentage of the damage. When the shields' own health drops below zero, they fail for a period of time
	public double DamageMultiplier;//the number the damage is multiplied by. Lower is better
	public double MaxHealth;//the max amount of health the shield can have
	public double CurrentHealth;//the current amount of health the shield has
	public double RegenPerTick; //the amount of regen per tick
	public double FixTime;//the amount of time that the shield will fail. Influenced by regen
	public double CurrentFix; //the current fix level
	public double PowerConsumptionPerRegenTick;//when regenerating health, this is the amount of power it will draw per tick
	
	//Thruster
	//thrusters propel the ship, drawing power
	public double Acceleration;//the acceleration, affected by mass
	public double PowerConsumptionPerThrust;
	
	//Weapon
	//weapons allow the ship to fire at enemies or asteroids
	public String EntityFired;//
	public double Velocity; // the velocity of the entity
	public double Spread; // the spread in radians
	public double DamageBoost;// the damage multiplier
	public int NumberFiredAtOnce;//bullets fired at once
	public int MaxWeaponReload;//Max reload level
	public int CurrentWeaponReload;//the current reload
	public int WeaponRegeneration; //how fast it reloads
	
	public void InitializeGenerator(double powergen, double max)
	{
		PowerGenerated = powergen;
		MaxPower = max;
		CurrentPower = max;
	}
	
	public void InitializeShield(double dammult, double max, double regen, double fixtime, double powersump)
	{
		DamageMultiplier = dammult;
		MaxHealth = max;
		
	}
	public void InitializeShield(DamageMultiplier )
	
	public Item(String name, String description, String type, Image sprite)
	{
		Name = name;
		Description = description;
		Type = type;
		Sprite = sprite;
	}
}