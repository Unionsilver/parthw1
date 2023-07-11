public class Main {

    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри  ", "Поттер", 100, 100, 100,
                40, 100);
        Gryffindor hermiona = new Gryffindor("Гермиона  ", "Грейнджер", 100, 100,
                30, 100, 100);
        Gryffindor ron = new Gryffindor("Рон  ", "Уизли", 100, 100, 100,
                50, 100);
        Puffendui zahariya = new Puffendui("Захария  ", "Смит", 29, 60, 49,
                74, 38);
        Puffendui sedrick = new Puffendui("Седрик  ", "Диггори", 49, 67, 66,
                28, 94);
        Puffendui jastin = new Puffendui("Джастин  ", "Финч-Флетчли", 97, 44,
                66, 78, 33);
        Cogtevran chou = new Cogtevran("Чжоу  ", "Чанг", 79, 89, 99, 83,
                89, 22);
        Cogtevran padma = new Cogtevran("Падма  ", "Патил", 44, 77, 44,
                77, 88, 33);
        Cogtevran marcus = new Cogtevran("Маркус  ", "Белби", 34, 87, 55,
                89, 33, 21);
        Slytherin draco = new Slytherin("Драко  ", "Малфой", 96, 100, 98,
                67, 44, 99, 99);
        Slytherin grehem = new Slytherin("Грэхэм  ", "Монтегю", 88, 70,
                56, 65, 79, 33, 97);
        Slytherin gregori = new Slytherin(" Грегори  ", "Гойл", 56, 95, 90,
                88, 99, 45, 88);
        System.out.println(harry);
        System.out.println(gregori);
        harry.toCompare(hermiona);
        draco.toCompare(grehem);
        harry.compareStudent(grehem);

    }
}