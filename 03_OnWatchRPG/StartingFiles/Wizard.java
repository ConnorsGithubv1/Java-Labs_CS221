public class Wizard extends Character {

    public Wizard(LongRest night) {
        super(night);
        this.setAttitude("Reading my spell book.");
    }

    public String toString() {
        return "Mysterious, Arcane Wizard";
    }

    @Override
    public void observeEncounter(Encounter encounter) {
        switch (encounter) {
            case Squirrel:
                this.setAttitude("I could transform that squirrel into a raveN.");
                break;
            case Goblin:
                this.setAttitude("I hope the goblin doesn't see me.");
                break;
            case Troll:
                this.setAttitude("Oh no, a troll! I wish I had prepared my fireball spell!.");
                break;
            case Dragon:
                this.setAttitude("See ya, I'm out of here.");
                break;
            default:
                // Handle the case of "Nothing" encounter or any other unexpected encounters.
                this.setAttitude("Reading my spell book.");
                break;
        }
    }

    @Override
    public void display() {
        System.out.println(this.getAttitude());
    }
}
