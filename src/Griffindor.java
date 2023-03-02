public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    Griffindor[] students = new Griffindor[3];
    public Griffindor(int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

}
