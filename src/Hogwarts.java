public abstract class Hogwarts {
    private String name;
    private String surname;
    int thePowerOfMagic;
    int transgressionDistance;

    public Hogwarts(String name, String surname, int thePowerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Хогвадс " +
                "Имя " + name + '\'' +
                ", Фамилия " + surname + '\'' +
                ", сила магии " + thePowerOfMagic +
                ", расстояние трансгрессии " + transgressionDistance +
                '}';
    }

    public void toCompare(Hogwarts student) {
        int sum1 = this.thePowerOfMagic + this.transgressionDistance;
        int sum2 = student.thePowerOfMagic + student.transgressionDistance;
        if (sum1 > sum2) {
            printResultOfStudent(this, student);
        } else if (sum1 < sum2) {
            printResultOfStudent(this, student);
        } else {
            System.out.println(" Равны между собой");
        }

    }

    private void printResultOfStudent(Hogwarts top, Hogwarts bottom) {
        System.out.println(top.getName() + " " + top.getSurname() + " сильнее чем " + bottom.getName()
                + " " + bottom.getSurname());
    }

    public void compareStudent (Hogwarts student){
        if (this.equals(student)) {
            System.out.println("Попытка сравнить одинакового студента ");
        } else {
            System.out.println("одинаковая статистика");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
