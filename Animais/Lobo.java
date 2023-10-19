package Animais;

public class Lobo extends Animal {

    public Lobo(String especie, int idade, int energia, boolean carnivoro, boolean fome, boolean herbivoro) {
        super(especie, idade, energia, carnivoro, fome, herbivoro);
    }

    @Override
    public void buscarComida() {
        System.out.println("O lobo caça sua presa na floresta.");
    }
}