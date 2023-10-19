public class Knight extends Character {

    public Knight(LongRest night) {
        super(night);
        this.setAttitude("Enjoying some quiet time polishing my sword.");
    }

    public String toString() {
        return "Knight in Shining Armor";
    }

    @Override
    public void observeEncounter(Encounter encounter) {
        switch (encounter) {
            case Squirrel:
                this.setAttitude("I hope the squirrel doesn't encounter an owl.");
                break;
            case Goblin:
                this.setAttitude("I bet I could scare the goblin away with a creepy noise.");
                break;
            case Troll:
                this.setAttitude("Now it's time to prove my mettle on this troll.");
                break;
            case Dragon:
                this.setAttitude("I don't like this dragon... I've been burnt before.");
                break;
            default:
                // Handle the case of "Nothing" encounter or any other unexpected encounters.
                this.setAttitude("Enjoying some quiet time polishing my sword.");
                break;
        }
    }

    @Override
    public void display() {
        System.out.println(this.getAttitude());
    }
}