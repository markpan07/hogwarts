import java.util.Random;
import java.util.Arrays;

public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;

    Random random = new Random();
    public Kogtevran(String name) {
        super(name);
        this.smart = random.nextInt(100);
        this.wise = random.nextInt(100);
        this.witty = random.nextInt(100);
    }


    public static Kogtevran findBestStudent(Kogtevran[] kogtevrans) {
        int[] sumOfSkills = new int[3];
        sumOfSkills = countSumOfSkills(kogtevrans);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if (sumOfSkills[i] > max) {
                max = sumOfSkills[i];
                index = i;
            }
        }
        return kogtevrans[index];
    }

    public static int[] countSumOfSkills(Kogtevran[] kogtevrans) {
        int[] sumOfSkills = new int[kogtevrans.length];
        for (int i = 0; i < kogtevrans.length; i++) {
            sumOfSkills[i] = kogtevrans[i].getSmart() + kogtevrans[i].getWise() + kogtevrans[i].getWitty();
        }
        return sumOfSkills;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ","
                + " Magic Power " + getMagicPower() + ","
                + " Transgression Distance " + getTransgressionDistance() + ","
                + "smart " + getSmart() + ","
                + "wise " + getWise() + ","
                + "witty " + getWitty();
    }
}


