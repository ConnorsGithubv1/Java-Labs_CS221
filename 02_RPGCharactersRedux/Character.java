public abstract class Character {
    /* declaring varaibles */
    private int hitPoints, armorClass;
    private WeaponBehavior weapon;

    /* created constructor that will be used by child classes */
    protected Character(int initialHitPoints, int armorClass, WeaponBehavior initialWeapon){
        this.hitPoints = initialHitPoints;
        this.armorClass = armorClass;
        this.weapon = initialWeapon;
    }

    /* methods used by child classes */
    public void fight(){
        if(this.hitPoints > 0){
            this.weapon.useWeapon();
        } else {
            System.out.println("Is down for the count. \n");
        }
    }

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }

    public WeaponBehavior getweapon(){
        return this.weapon;
    }

    public int getHitpoints(){
        return hitPoints;
    }

    public int getArmorClass(){
        return armorClass;
    }

    public void takeDamage(int damage){
        this.hitPoints = this.hitPoints - damage;
    }

}
