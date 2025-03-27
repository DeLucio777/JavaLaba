package main.pack;


public class Tester {
    public String name;
    public String surname;
    public int expirienceInYears;
    public String englishLevel;
    public double salary;


    public Tester(String name, String surname) {
        this(name, surname, 0, "Не", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "Не", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void displayInfo(int years) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + years + " лет");
    }

    public void displayInfo(String level) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Уровень английского: " + level);
    }
    public void displayInfo(double salary) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Уровень английского: " + englishLevel + ", ЗП: " + salary);
    }

    public static void printWelcomeMessage() {
        System.out.println("Добро пожаловать к тестерам.");
        ///hi
    }///hello
}///new comments here:
