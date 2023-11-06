
class Wizard extends Character{
    public Wizard() {
        super(9, 10, "none", "staff", true);
    }

    public void castsSpell() {
        System.out.println("My real power is in my spells!");
    }

    public void solvesProblems() {
        System.out.println("I am the best problem-solver in the party.");
    }

    public void useWeapon() {
        System.out.println("I can hit monsters with my " + weaponType + ".");
    }

    @Override
    public String toString() {
        return "I am a wizard.\n" + super.toString();
    }

}
