public class Runner {
    public static void main(String[] args) {
        Computer computer1 = new Computer(2400, 1024, 512, 5);
        computer1.onComputer();
        computer1.onComputer();
        computer1.offComputer();
        computer1.offComputer();
        computer1.onComputer();
        computer1.onComputer();
        System.out.println(computer1.toString());
    }
}
