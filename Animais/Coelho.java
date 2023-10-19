package Animais;

public class Coelho extends Animal {

    public Coelho(String especie, int idade, int energia, boolean carnivoro, boolean fome, boolean herbivoro) {
        super(especie, idade, energia, carnivoro, fome, herbivoro);
    }

    @Override
    public void buscarComida() {
        System.out.println("O coelho procura por folhas e vegetação para se alimentar.");
    }
}