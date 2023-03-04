import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //Students-objects creation
        Griffindor[] griffindors = {
                new Griffindor("Ron Weasley"),
                new Griffindor("Hermione Granger"),
                new Griffindor("Harry Potter")
        };

        Puffinduy[] puffinduys = {
                new Puffinduy("Zacharias Smith"),
                new Puffinduy("Cedric Diggory"),
                new Puffinduy("Justin Finch Fletchley")
        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Zhou Chang"),
                new Kogtevran("Padma Patil"),
                new Kogtevran("Marcus Belby")
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy"),
                new Slytherin("Graham Montagu"),
                new Slytherin("Gregory Goyle")
        };


        System.out.println(slytherins[0]);
        System.out.println(slytherins[1]);
        System.out.println(slytherins[2]);
        System.out.println(Arrays.toString(Slytherin.countSumOfSkillsForEachStudent(slytherins)));
        System.out.println(Slytherin.findBestStudent(slytherins));
        System.out.println("");
        System.out.println(kogtevrans[0]);
        System.out.println(kogtevrans[1]);
        System.out.println(kogtevrans[2]);
        System.out.println(Arrays.toString(Kogtevran.countSumOfSkills(kogtevrans)));
        System.out.println(Kogtevran.findBestStudent(kogtevrans));
        Hogwarts.compare(slytherins[0], kogtevrans[0]);
        System.out.println(slytherins[0].compare(slytherins[1])); //test of compare method
    }

}