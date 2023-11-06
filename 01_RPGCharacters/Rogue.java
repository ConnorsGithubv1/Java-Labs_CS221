
class Rogue extends Character {
    public Rogue() {
        super(11, 16, "light", "simple", false);
    }

    public void useWeapon() {
        System.out.println("I kill monsters with " + weaponType + " weapons.");
    }

    public void sneaksAround() {
        System.out.println("I am very sneaky!");
    }

    public void picksLock() {
        System.out.println("Picking locks is my speciality!");
    }

    @Override
    public String toString() {
        return "I am a rogue.\n" + super.toString();
    }
}
