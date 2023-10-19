package Animais;

public class Sapo extends Animal {

    public Sapo(String especie, int idade, int energia, boolean carnivoro, boolean fome, boolean herbivoro) {
        super(especie, idade, energia, carnivoro, fome, herbivoro);
    }

    @Override
    public void buscarComida() {
        System.out.println("O sapo pula em busca de insetos.");
    }
}