import java.util.Random;
import java.util.Arrays;

public class Puffinduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    Random random = new Random();

    public Puffinduy(String name) {
        super(name);
        this.hardworking = random.nextInt(100);
        this.loyal = random.nextInt(100);
        this.honest = random.nextInt(100);
    }

    public static Puffinduy findBestStudent(Puffinduy[] puffinduys) {
        int[] sumOfSkills = new int[3];
        sumOfSkills = countSumOfSkills(puffinduys);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if (sumOfSkills[i] > max) {
                max = sumOfSkills[i];
                index = i;
            }
        }
        return puffinduys[index];
    }

    public static int[] countSumOfSkills(Puffinduy[] puffinduys) {
        int[] sumOfSkills = new int[puffinduys.length];
        for (int i = 0; i < puffinduys.length; i++) {
            sumOfSkills[i] = puffinduys[i].getHardworking() + puffinduys[i].getLoyal() + puffinduys[i].getHonest();
        }
        return sumOfSkills;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ","
                + " Magic Power " + getMagicPower() + ","
                + " Transgression Distance " + getTransgressionDistance() + ","
                + "hardworking " + getHardworking() + ","
                + "loyal " + getLoyal() + ","
                + "honest " + getHonest();
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
}