public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;



    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
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
