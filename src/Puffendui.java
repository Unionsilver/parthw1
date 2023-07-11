public class Puffendui extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffendui(String name, String surname, int hardworking, int loyal, int honest, int thePowerOfMagic,
                     int transgressionDistance) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Пуффендуй " +
                super.toString() +
                ", трудолюбивы " + hardworking +
                ", верны " + loyal +
                ", честны " + honest +
                '}';
    }

    public void toCompare(Puffendui another) {
        int sum1 = this.hardworking + this.loyal + this.honest;
        int sum2 = another.hardworking + another.loyal + another.honest;
        if (sum1 > sum2) {
            printResultOfStudent(this,another);
        } else if (sum1 < sum2) {
            printResultOfStudent(this, another);
        } else {
            System.out.println("Равны между собой");
        }
    }
    private void printResultOfStudent(Puffendui top, Puffendui bottom) {
        System.out.println(top.getName() + " " + top.getSurname() + " сильнее чем " + bottom.getName()
                + " " + bottom.getSurname());
    }
}
