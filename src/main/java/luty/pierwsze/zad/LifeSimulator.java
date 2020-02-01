package luty.pierwsze.zad;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LifeSimulator {

   public static void simulate(List<Programmer> list, int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            for(Programmer singleProg: list){
                if (singleProg.isAlive()) {
                    work(singleProg);
                }
                if (singleProg.isAlive()) {
                    play(singleProg);
                }
                rest(singleProg);
            }
        }
        Set<Programmer> aliveSet = new HashSet<>();
        Set<Programmer> notAliveSet = new HashSet<>();
        for (Programmer resultProgrammer: list ){
if (resultProgrammer.isAlive()){
    aliveSet.add(resultProgrammer);
}else {
    notAliveSet.add(resultProgrammer);
}
        }
       System.out.println("alive progs: " + aliveSet);
       System.out.println("not alive progs: " + notAliveSet);
    }
   public static void work(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is working");
        checkStatus(programmer, 10);
    }
   public static void play(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is playing");
        checkStatus(programmer, 20);
   }
   public static void rest(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is on rest");
        checkStatus(programmer, 3);
    }
    public static void checkStatus(Programmer programmer, int chanceToDie) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        if (randomNumber < chanceToDie) {
            programmer.setAlive(false);


        }
    }
}

