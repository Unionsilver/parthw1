public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int nobility, int honor,
                      int bravery, int thePowerOfMagic, int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндорцы " +
                super.toString() +
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбрость" + bravery +
                '}';
    }

    public void toCompare(Gryffindor another) {
        int sum1 = this.nobility + this.honor + this.bravery;
        int sum2 = another.nobility + another.honor + another.bravery;

        if (sum1 > sum2) {
            printResultOfStudent(this, another);
        } else if (sum1 < sum2) {
            printResultOfStudent(this, another);
        } else {
            System.out.println("Равны между собой");
        }
    }

    private void printResultOfStudent(Gryffindor top, Gryffindor bottom) {
        System.out.println(top.getName() + " " + top.getSurname() + " сильнее чем " + bottom.getName()
                + " " + bottom.getSurname());
    }
}
