public class Slytherin extends Hogwarts{
    private int cunning;
    private int susceptibility;
    private int impregnability;
    private int resourcefulness;
    private int lustForPower;

    Slytherin[] students = new Slytherin[3];

    public Slytherin(int magicPower, int transgressionDistance, int cunning, int susceptibility, int impregnability, int resourcefulness, int lustForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.susceptibility = susceptibility;
        this.impregnability = impregnability;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getSusceptibility() {
        return susceptibility;
    }

    public int getImpregnability() {
        return impregnability;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
