import java.util.Random;

public class Slytherin extends Hogwarts {
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
        sumOfSkills = countSumOfSkillsForEachStudent(slytherins);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if (sumOfSkills[i] > max) {
                max = sumOfSkills[i];
                index = i;
            }
        }
        return slytherins[index];
    }

    public static int[] countSumOfSkillsForEachStudent(Slytherin[] slytherins) {
        int[] sumOfSkills = new int[slytherins.length];
        for (int i = 0; i < slytherins.length; i++) {
            sumOfSkills[i] = slytherins[i].getCunning() + slytherins[i].getSusceptibility() + slytherins[i].getImpregnability()
                    + slytherins[i].getResourcefulness() + slytherins[i].getLustForPower();
        }
        return sumOfSkills;
    }

    public int countSumOfFacultySkills() {
        int sum = this.getCunning() + this.getSusceptibility() + this.getImpregnability()
                + this.getResourcefulness() + this.getLustForPower();
        return sum;
    }


    public String compare(Slytherin student) {
        int skillOfThisStudent;
        int skillOfParametrStudent;
        skillOfThisStudent = this.countSumOfFacultySkills();
        skillOfParametrStudent = student.countSumOfFacultySkills();
        if(skillOfParametrStudent > skillOfThisStudent) {
            return student.getName() + " is better Slytherin's than " + this.getName();
        } else if (skillOfParametrStudent < skillOfThisStudent) {
            return this.getName() + " is better Slytherin's than " + student.getName();
        } else {
            return this.getName() + " and " + student.getName() + " are equal";
        }

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
