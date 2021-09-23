package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Guerreiros warrior1 = new Guerreiros("Kezihakh Agrofite ", 500);
        Inimigos enemy1 = new Inimigos("Kuoar Regozor", 550);

        System.out.println("_________Welcome to the final batle_________");
        System.out.println("Warrior: ");
        System.out.println("____X____");
        System.out.println(warrior1.getNome());
        System.out.println("______________VERSUS______________");
        System.out.println("Warrior:");
        System.out.println("____X____");
        System.out.println(enemy1.getNome());
    }
}
