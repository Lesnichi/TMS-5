import java.util.Random;
import java.util.Scanner;

public class Computer {
    int processor;
    int ram;
    int hdd;
    int resource;
    int counterTurnOnOff;
    boolean isAlive = true;

    public Computer(int processor, int ram, int hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", resource=" + resource +
                '}';
    }

    void onComputer() {
        if (counterTurnOnOff < resource && isAlive == true) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int a;
            do {
                System.out.println("Для включения компьютера введите число 1 или 0");
                a = scanner.nextInt();
                if (a != 1 && a != 0) {
                    System.out.println("Вы ввели неверное число. Попробуйте еще разок");
                }
            } while (a != 0 && a != 1);

            if (a == random.nextInt(1 + 1)) {
                System.out.println("Вы угадали и компьютер запустился.");
                counterTurnOnOff++;
            } else {
                System.out.println("Вы не угадали и компьютер сгорел.");
                counterTurnOnOff++;
                isAlive = false;
            }
        } else {
            System.out.println("Компьютер сгорел и не может больше запуститься");
        }
    }

    void offComputer() {
        if (counterTurnOnOff < resource && isAlive == true) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int a;
            do {
                System.out.println("Для выключения компьютера введите число 1 или 0");
                a = scanner.nextInt();
                if (a != 1 && a != 0) {
                    System.out.println("Вы ввели неверное число. Попробуйте еще разок");
                }
            } while (a != 0 && a != 1);

            if (a == random.nextInt(1 + 1)) {
                System.out.println("Вы угадали и компьютер выключился.");
                counterTurnOnOff++;
            } else {
                System.out.println("Вы не угадали и компьютер сгорел.");
                counterTurnOnOff++;
                isAlive = false;
            }
        } else {
            System.out.println("Компьютер выключен так как сгорел");
        }
    }

}
