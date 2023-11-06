class Barbarian extends Character {
    public Barbarian() {
        super(21, 13, "medium", "martial", true);
    }

    public void tendsToRage() {
        System.out.println("When I get angry I fight better.");
    }

    @Override
    public String toString() {
        return "I am a barbarian.\n" + super.toString();
    }
}
