public class Puffinduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;



    public Puffinduy(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public static Puffinduy findBestStudent(Puffinduy[] puffinduys) {
        int[] sumOfSkills = new int[3];
        sumOfSkills = countSumOfSkills(puffinduys);
        int max = sumOfSkills[0];
        int index = 0;
        for (int i = 0; i < sumOfSkills.length; i++) {
            if(sumOfSkills[i] > max) {
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