import java.util.Random;

class dice {
    private int fase;

    public dice() {
        roll();
    }

    public void roll() {
        Random rand = new Random();
        int curr_faceValue = 1 + rand.nextInt(2);
        setfase(curr_faceValue);
    }

    private void setfase(int value) {
        if (value <= 2) {
            fase = value;
        }
    }

    public int getfase() {
        return fase;
    }

    
}
