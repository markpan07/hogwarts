import java.util.Random;
import java.util.Arrays;
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

    public static void compare(Hogwarts firstStudent, Hogwarts secondStudent) {
        if(countSumOfSkills(firstStudent) > countSumOfSkills(secondStudent)) {
            System.out.println(firstStudent.getName() + "(" + countSumOfSkills(firstStudent) + " points) " +
                    " is more powerfull than " + secondStudent.getName() + "(" + countSumOfSkills(secondStudent) + " points)" );
        } else if (countSumOfSkills(firstStudent) < countSumOfSkills(secondStudent)) {
            System.out.println(firstStudent.getName() + "(" + countSumOfSkills(firstStudent) + " points) " +
                    " is less powerfull than " + secondStudent.getName() + "(" + countSumOfSkills(secondStudent) + " points)" );
        }
    }

    public static int countSumOfSkills(Hogwarts student) {
        return student.getMagicPower() + student.getTransgressionDistance();

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
