import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Set up Hero 1
        System.out.println("Permainan adu hero");
        System.out.println("Silahkan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan anga Antara 0 hingga 500!");
        System.out.println("==============================");
        Hero hero1 = new Hero();
        System.out.println("Nama Hero\t:");
        hero1.setName(input.nextLine());
        System.out.println("Hitpoint\t:");
        hero1.setHp(input.nextDouble());
        System.out.println("Attack\t");
        hero1.setAtk(input.nextDouble());
        System.out.println("==============================");

        // Set up Hero 2
        Hero hero2 = new Hero("Hilichurl", 500, 150);

        // Start battle loop
        System.out.println("==============================");
        int ronde = 1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("Ronde " + ronde);

            // Hero 1 menyerang Hero 2
            System.out.println(hero1.getName() + " menyerang " + "Hilichurl");
            System.out.println("");
            System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAtk());
            System.out.println("Hilichurl" + " memiliki HP sebesar " + hero2.getHp() + " hp");
            hero2.setHp(hero2.getHp() - hero1.getAtk());
            System.out.println("");

            // Hero 2 menyerang Hero 1
            System.out.println("Hilichurl" + " menyerang " + hero1.getName());
            System.out.println("");
            System.out.println("Hilichurl" + " menyerang sebesar " + hero2.getAtk());
            System.out.println(hero1.getName() + " memiliki HP sebesar " + hero1.getHp() + " hp.");
            hero1.setHp(hero1.getHp() - hero2.getAtk());
            System.out.println("");

            ronde++;
        }

        // Print winner
        if (hero1.getHp() > 0) {
            System.out.println(hero1.getName() + " wins!");
        } else {
            System.out.println("Hilichurl" + " wins!");
        }
        System.out.println("==============================");
        System.out.println("==============================");
        input.close();
    }
}