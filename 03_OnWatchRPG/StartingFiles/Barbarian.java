public class Barbarian extends Character {

    public Barbarian(LongRest night) {
        super(night);
        this.setAttitude("Staring into the fire... feeling hungry.");
    }

    public String toString() {
        return "Fur-clad Raging Barbarian";
    }

    @Override
    public void observeEncounter(Encounter encounter) {
        switch (encounter) {
            case Squirrel:
                this.setAttitude("The Squirrel would make a good snack.");
                break;
            case Goblin:
                this.setAttitude("I could slice that goblin in two with one blow.");
                break;
            case Troll:
                this.setAttitude("Bet I could dice up the troll faster than it can regenerate.");
                break;
            case Dragon:
                this.setAttitude("Wonder how bad the dragon's fire hurts!!");
                break;
            default:
                // Handle the case of "Nothing" encounter or any other unexpected encounters.
                this.setAttitude("Staring into the fire... feeling hungry.");
                break;
        }
    }

    @Override
    public void display() {
        System.out.println(this.getAttitude());
    }
}
