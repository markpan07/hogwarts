public class Puffinduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;


    //Puffinduy[] students = new Puffinduy[3];


    public Puffinduy(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Name " + getName() + ","
                + " Magic Power " + getMagicPower() + ","
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