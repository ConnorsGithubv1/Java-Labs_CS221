
class Knight extends Character {
    public Knight() {
        super(17, 17, "heavy", "martial", true);
    }

    @Override
    public String toString() {
        return "I am a knight.\n" + super.toString();
    }
}