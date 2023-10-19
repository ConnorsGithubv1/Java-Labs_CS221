public class Wizard extends Character {

    
    /* Constructs a wizard character and pulls data from adventure */
    public Wizard(int initialHitPoints, int armorClass, WeaponBehavior initialWeapon){
        super(initialHitPoints, armorClass, initialWeapon);
    }
    
    public String toString() {
        return "Mysterious, Arcane Wizard";
    }
}