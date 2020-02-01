package luty.pierwsze.zad;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<Programmer> listOfProgrammers = new ArrayList<>();
        listOfProgrammers.add(new Programmer(1, "John", "Smith", Gender.MEN));
        listOfProgrammers.add(new Programmer(2, "Sebastian", "Kowalski", Gender.MEN));
        listOfProgrammers.add(new Programmer(3, "Ann", "Goodman", Gender.WOMEN));
        listOfProgrammers.add(new Programmer(4, "Abdullah", "Mohammed", Gender.MEN));
        listOfProgrammers.add(new Programmer(5, "Gertruda", "Schmidt", Gender.WOMEN));
        listOfProgrammers.add(new Programmer(6, "Pink", "Unicorn", Gender.OTHER));
        listOfProgrammers.add(new Programmer(7, "Jozin", "Z Bazin", Gender.MEN));
        listOfProgrammers.add(new Programmer(8, "Matrix", "Matrix", Gender.OTHER));
        LifeSimulator.simulate(listOfProgrammers, 20);
    }
}
