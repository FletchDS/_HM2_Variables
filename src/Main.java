public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        //Задача 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Задача 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("\ndog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Задача 4
        var friend = 19;
        System.out.println("\nfriend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        //Задача 5
        var frog = 3.5;
        System.out.println("\nfrog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        //Задача 6
        var firstFighter = 78.2;
        var secondFighter = 82.7;

        System.out.println("\nОбщая масса = " + (firstFighter + secondFighter));
        System.out.println("Разница в массе = " + (secondFighter - firstFighter));

        //Задача 7
        System.out.println("\nОстаток от деления = " + (secondFighter % firstFighter));

        //Задача 8
        var totalWorkingTime = 640;
        var employeeWorkingHours = 8;
        var totalEmployees = totalWorkingTime / employeeWorkingHours;

        System.out.println("\nВсего работников в компании — " + totalEmployees + " человек");

        totalEmployees += 94;
        employeeWorkingHours = totalEmployees * employeeWorkingHours;

        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + employeeWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}