public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;


    public Kogtevran(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }


    public static Kogtevran findBestStudent(Kogtevran[] kogtevrans) {
        int[] sumOfSkills = new int[3];
        sumOfSkills = countSumOfSkills(kogtevrans);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if(sumOfSkills[i] > max) {
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


