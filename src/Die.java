import java.util.Random;

public class Die {
    private int face;
    private int dieSides;

    Die(int sides) {
        dieSides = sides;
        face = 1;
    }

    Die() {
        dieSides = 6;
        face = 1;
    }

    public int getFace() {
        return face;
    }

    public int getTotalFace() {
        return dieSides;
    }

    public void roll() {
        Random r = new Random();
        face = r.nextInt(dieSides) + 1;
    }
}
