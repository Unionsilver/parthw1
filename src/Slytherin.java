public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int thePowerOfMagic, int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизерин " +
                super.toString() +
                ", хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + lustForPower +
                '}';
    }

    public void toCompare(Slytherin another) {
        int sum1 = this.cunning + this.determination + this.ambition + this.resourcefulness
                + this.lustForPower;
        int sum2 = another.cunning + another.determination + another.ambition + another.resourcefulness
                + another.lustForPower;
        if (sum1 > sum2) {
            printResultOfStudent(this, another);
        } else if (sum1 < sum2) {
            printResultOfStudent(this, another);
        } else {
            System.out.println("Равны между собой");
        }
    }

    private void printResultOfStudent(Slytherin top, Slytherin bottom) {
        System.out.println(top.getName() + " " + top.getSurname() + " сильнее чем " + bottom.getName()
                + " " + bottom.getSurname());
    }
}




