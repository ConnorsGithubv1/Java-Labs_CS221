class Character {
    protected int hitPoints;
    protected int armorClass;
    protected String armorType;
    protected String weaponType;
    protected boolean hasSpecialAbility;

    public Character(int hitPoints, int armorClass, String armorType, String weaponType, boolean hasSpecialAbility) {
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.armorType = armorType;
        this.weaponType = weaponType;
        this.hasSpecialAbility = hasSpecialAbility;
    }

    public void wearArmor() {
        System.out.println("I wear " + armorType + " armor!");
    }

    public void useWeapon() {
        System.out.println("I wield " + weaponType + " weapons against monsters.");
    }

    public void hasManeuvers() {
        System.out.println("I got some cool fighting moves!");
    }
    
    @Override
    public String toString() {
        return "I have " + hitPoints + " HPs and " + armorClass + " AC";
    }
}
