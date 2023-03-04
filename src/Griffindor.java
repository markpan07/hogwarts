import java.util.Arrays;
import java.util.Random;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    Random random = new Random();

    public Griffindor(String name) {
        super(name);
        this.nobility = random.nextInt(100);
        this.honor = random.nextInt(100);
        this.courage = random.nextInt(100);
    }

    public static Griffindor findBestStudent(Griffindor[] griffindors) {
        int[] sumOfSkills = new int[3];
        sumOfSkills = countSumOfSkills(griffindors);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if (sumOfSkills[i] > max) {
                max = sumOfSkills[i];
                index = i;
            }
        }
        return griffindors[index];
    }

    public static int[] countSumOfSkills(Griffindor[] griffindors) {
        int[] sumOfSkills = new int[griffindors.length];
        for (int i = 0; i < griffindors.length; i++) {
            sumOfSkills[i] = griffindors[i].getNobility() + griffindors[i].getHonor() + griffindors[i].getCourage();
        }
        return sumOfSkills;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ","
                + " Magic Power " + getMagicPower() + ","
                + " Transgression Distance " + getTransgressionDistance() + ","
                + "nobility " + getNobility() + ","
                + "honor " + getHonor() + ","
                + "courage " + getCourage();
    }
}