
class Ranger extends Character {
    public Ranger() {
        super(13, 15, "medium", "martial", false);
    }

    public void sneaksAround() {
        System.out.println("I am very sneaky!");
    }

    public void willToSurvive() {
        System.out.println("I will survive in the wild!");
    }

    @Override
    public String toString() {
        return "I am a ranger.\n" + super.toString();
    }
}
