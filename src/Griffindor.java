public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;


    //Griffindor[] students = new Griffindor[3];
    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public static Griffindor findBestStudent(Griffindor[] griffindors) {
        int[] sumOfSkills = new int[3];
        sumOfSkills = countSumOfSkills(griffindors);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if(sumOfSkills[i] > max) {
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