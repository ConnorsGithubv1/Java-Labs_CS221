
class Cleric extends Character {
    public Cleric() {
        super(14, 17, "medium", "simple", true);
    }

    public void castsSpell() {
        System.out.println("My real power is in my spell.");
    }

    public void healsOthers() {
        System.out.println("My friends can rely upon my medical skills.");
    }

    public void useWeapon() {
        System.out.println("I kill monsters with " + weaponType + " weapons.");
    }

    @Override
    public String toString() {
        return "I am a cleric.\n" + super.toString();
    }

}
