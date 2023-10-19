public class Ranger extends Character {

    
    /* Constructs a ranger character and pulls data from adventure */

    public Ranger(int initialHitPoints, int armorClass, WeaponBehavior initialWeapon){
        super(initialHitPoints, armorClass, initialWeapon);
    }
    
    public String toString() {
        return "Quick, Stealthy Ranger";
    }
}