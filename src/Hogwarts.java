import java.util.Random;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    Random random = new Random();

    public Hogwarts(String name) {
        this.name = name;
        this.magicPower = random.nextInt(100);
        this.transgressionDistance = random.nextInt(100);
    }

    public String compareBasicSkills(Hogwarts student) {
        if (student.countSumOfSkills() > this.countSumOfSkills()) {
            return student.getName() + "(" + student.countSumOfSkills() + " points) " +
                    " is more powerfull than " + this.getName() + "(" + this.countSumOfSkills() + " points)";
        } else if (student.countSumOfSkills() < this.countSumOfSkills()) {
            return this.getName() + "(" + this.countSumOfSkills() + " points) " +
                    " is more powerfull than " + student.getName() + "(" + student.countSumOfSkills() + " points)";
        } else {
            return this.getName() + "(" + this.countSumOfSkills() + " points) " + "and " +
                    student.getName() + "(" + student.countSumOfSkills() + " points) " + " are equal";

        }
    }

    private int countSumOfSkills() {
        return this.getMagicPower() + this.getTransgressionDistance();

    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ","
                + " Magic Power " + getMagicPower() + ","
                + " Transgression Distance " + getTransgressionDistance();
    }
}
