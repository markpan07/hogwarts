import java.util.Random;
import java.util.Arrays;
public class Slytherin extends Hogwarts{
    private int cunning;
    private int susceptibility;
    private int impregnability;
    private int resourcefulness;
    private int lustForPower;

    Random random = new Random();
    //Slytherin[] students = new Slytherin[3];

    public Slytherin(String name) {
        super(name);
        this.cunning = random.nextInt(100);
        this.susceptibility = random.nextInt(100);
        this.impregnability = random.nextInt(100);
        this.resourcefulness = random.nextInt(100);
        this.lustForPower = random.nextInt(100);
    }

    public static Slytherin findBestStudent(Slytherin[] slytherins) {
        int[] sumOfSkills = new int[3];
        sumOfSkills = countSumOfSkills(slytherins);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if(sumOfSkills[i] > max) {
                max = sumOfSkills[i];
                index = i;
            }
        }
        return slytherins[index];
    }

    public static int[] countSumOfSkills(Slytherin[] slytherins) {
        int[] sumOfSkills = new int[slytherins.length];
        for (int i = 0; i < slytherins.length; i++) {
            sumOfSkills[i] = slytherins[i].getCunning() + slytherins[i].getSusceptibility() + slytherins[i].getImpregnability()
                    + slytherins[i].getResourcefulness() + slytherins[i].getLustForPower();
        }
        return sumOfSkills;
    }

    private Slytherin compare(Slytherin student) {
        return null;
    }

    public int getCunning() {
        return cunning;
    }

    public int getSusceptibility() {
        return susceptibility;
    }

    public int getImpregnability() {
        return impregnability;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ","
                + " Magic Power " + getMagicPower() + ","
                + " Transgression Distance " + getTransgressionDistance() + ","
                + "Cunning " + getCunning() + ","
                + "susceptibility " + getSusceptibility() + ","
                + "impregnability " + getImpregnability() + ","
                + "resourcefulness " + getResourcefulness() + ","
                + "lustForPower " + getLustForPower();
    }
}
