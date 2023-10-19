public class Ranger extends Character {

    public Ranger(LongRest night) {
        super(night);
        this.setAttitude("The stars are beautiful.");
    }

    public String toString() {
        return "Quick, Stealthy Ranger";
    }

    @Override
    public void observeEncounter(Encounter encounter) {
        switch (encounter) {
            case Squirrel:
                this.setAttitude("The simple life of a squirrel is marvelous.");
                break;
            case Goblin:
                this.setAttitude("Goblins are such a distortion of nature.");
                break;
            case Troll:
                this.setAttitude("I hate trolls! Time to light up my arrows.");
                break;
            case Dragon:
                this.setAttitude("My arrows cannot penetrate the dragon scales!");
                break;
            default:
                // Handle the case of "Nothing" encounter or any other unexpected encounters.
                this.setAttitude("The stars are beautiful.");
                break;
        }
    }

    @Override
    public void display() {
        System.out.println(this.getAttitude());
    }
}
