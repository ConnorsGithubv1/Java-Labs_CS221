public class Knight extends Character {

    /* Constructs a knight character and pulls data from adventure */
    public Knight(int initialHitPoints, int armorClass, WeaponBehavior initialWeapon){
        super(initialHitPoints, armorClass, initialWeapon);
    }
    
    public String toString() {
        return "Knight in Shining Armor";
    }
}