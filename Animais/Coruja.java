package Animais;

public class Coruja extends Animal {

    public Coruja(String especie, int idade, int energia, boolean carnivoro, boolean fome, boolean herbivoro) {
        super(especie, idade, energia, carnivoro, fome, herbivoro);
    }

    @Override
    public void buscarComida() {
        System.out.println("A coruja voa silenciosamente em busca de roedores.");
    }
}
