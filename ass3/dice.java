
import java.util.Random;

class dice {
    private final int mx = 2;
    private int fase;

    public dice() {
        roll();
    }

    public void roll() {
        Random rand = new Random();
        int curr_faceValue = 1 + rand.nextInt(mx);
        setfase(curr_faceValue);
    }

    private void setfase(int value) {
        if (value <= mx) {
            fase = value;
        }
    }

    public int getfase() {
        return fase;
    }

    public int getmx() {
        return mx;
    }

    public String toString() {
        return ("dice gave " + fase);
    }
}
