import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //Students-objects creation
        Griffindor[] griffindors = {
                new Griffindor("Ron Weasley", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Griffindor("Hermione Granger", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Griffindor("Harry Potter", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };

        Puffinduy[] puffinduys = {
                new Puffinduy("Zacharias Smith", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Puffinduy("Cedric Diggory", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Puffinduy("Justin Finch Fletchley", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100))};

        Kogtevran[] kogtevrans = {
                new Kogtevran("Zhou Chang", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Kogtevran("Padma Patil", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Kogtevran("Marcus Belby", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Graham Montagu", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Gregory Goyle", random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };

        System.out.println(slytherins[0]);
        System.out.println(griffindors[0]);
    }
}