package main.pack;


public class Main {

    public static void main(String[] args){
        System.out.println("Hello, Ilya");
        Tester.printWelcomeMessage();
        Tester tester = new Tester("Мишаня", "Жучара", 2, "Средний", 1000);
        tester.displayInfo();
        tester.displayInfo(tester.expirienceInYears);
        tester.displayInfo(tester.englishLevel);
        tester.displayInfo(tester.salary);
    }
}
//commit
//comment1



