public class NouvelleClasse {
    private int leInt;
    private float leFloat;
    private static int leStaticInt = 14;

    public NouvelleClasse(int leInt, float leFloat) {
        this.leInt = leInt;
        this.leFloat = leFloat;
        leStaticInt = leInt;
    }

    public NouvelleClasse() {
        // Call the other constructor with default values
        this(0, 0);
    }

    public int getLeInt() {
        return leInt;
    }

    public float getLeFloat() {
        return leFloat * 2;
    }

    public void setLeInt(int newInt) {
        this.leInt = Math.max(0, newInt);
    }

    public void setLeFloat(float newFloat) {
        this.leFloat = Math.max(0, newFloat);
    }

    public static float getStaticIntAsFloat() {
        return (float) leStaticInt;
    }

    private class InnerClasse {
        // Put your methods in it
    }
}