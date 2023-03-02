public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;

    Kogtevran[] students = new Kogtevran[3];

    public Kogtevran(int magicPower, int transgressionDistance, int smart, int wise, int witty) {
        super(magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
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

}

}
