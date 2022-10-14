package pl.vistula.randomstepien;

public class RandomStepien {

    public static void main(String[] args) {

        int RandomNumberStepien = 0;
        int ModuloStepien = 0;

        RandomNumberStepien = (int)(Math.random() * 100 + 1);

        System.out.println("Wylosowana liczba z przedziau 1 - 100: " + RandomNumberStepien);

        ModuloStepien = RandomNumberStepien % 2;

        if(ModuloStepien == 0) System.out.println("Wylosowana liczba jest parzysta.");
        else System.out.println("Wylosowana liczba jest nieparzysta.");
    }
}
