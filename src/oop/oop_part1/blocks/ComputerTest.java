package oop.oop_part1.blocks;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer(); // Apple, macOS
        System.out.println(computer1.brand);
        System.out.println(computer1.OS);

        System.out.println(Computer.hasRAM);
    }
}
