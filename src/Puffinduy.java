public class Puffinduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    Puffinduy[] students = new Puffinduy[3];


    public Puffinduy(int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

}
