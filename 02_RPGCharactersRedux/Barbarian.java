public class Barbarian extends Character {

    
    /* Constructs a Barbarian character and pulls data from adventure */
    public Barbarian(int initialHitPoints, int armorClass, WeaponBehavior initialWeapon){
        super(initialHitPoints, armorClass, initialWeapon);
    }
    
    public String toString() {
        return "Fur-clad Raging Barbarian";
    }
}