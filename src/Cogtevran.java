public class Cogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Cogtevran(String name, String surname, int smart, int wise, int witty, int fullOfCreativity,
                     int thePowerOfMagic, int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Когтевранцы{" +
                super.toString() +
                ", умны " + smart +
                ", мудры " + wise +
                ", остроумны " + witty +
                ", полны творчества " + fullOfCreativity +
                '}';
    }

    public void toCompare(Cogtevran another) {
        int sum1 = this.smart + this.wise + this.witty + this.fullOfCreativity;
        int sum2 = another.smart + another.wise + another.witty + another.fullOfCreativity;
        if (sum1 > sum2) {
            printResultOfStudent(this, another);
        } else if (sum1 < sum2) {
            printResultOfStudent(this, another);
        } else {
            System.out.println("Равны между собой");
        }
    }

    private void printResultOfStudent(Cogtevran top, Cogtevran bottom) {
        System.out.println(top.getName() + " " + top.getSurname() + " сильнее чем " + bottom.getName()
                + " " + bottom.getSurname());
    }
}
