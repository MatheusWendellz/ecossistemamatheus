package Ambiente;

import Animais.Animal;
import Animais.Sapo;
import Animais.Coelho;
import Animais.Lobo;
import Animais.Coruja;
import Floresta.Arvore;
import Floresta.Grama;
import java.util.ArrayList;
import java.util.List;

public class ecossistema {

    public static void main(String[] args) {
        System.out.println("Bem-vindo à Simulação da Floresta");

        Sapo sapo = new Sapo("Sapo Verde", 3, 5, true, false, false);
        Coelho coelho = new Coelho("Coelho Selvagem", 3, 9, false, false, true);
        Lobo lobo = new Lobo("Lobo Branco", 6, 7, true, false, false);
        Coruja coruja = new Coruja("Coruja Bege", 4, 4, true, false, false);
        Arvore arvore = new Arvore("Carvalho", 10);
        Grama grama = new Grama("Grama", 2);
       
        List<Animal> animais = new ArrayList<>();
        animais.add(sapo);
        animais.add(coelho);
        animais.add(lobo);
        animais.add(coruja);

        simularDia(animais);
        // Simulação de crescimento da natureza
        arvore.crescimento();
        grama.crescimento();
    }

    public static void simularDia(List<Animal> animais) {
        System.out.println("O dia começa.");

        for (Animal animal : animais) {
            animal.acordar();
        }

        System.out.println("Animais estão rondando pela floresta");
        System.out.println("Começaram a buscar comida");

        for (Animal animal : animais) {
            animal.buscarComida();
        }

        for (Animal animal : animais) {
            animal.buscarComida();
            if (animal instanceof Lobo) {
                for (Animal outroAnimal : animais) {
                    if (outroAnimal != animal && outroAnimal instanceof Coelho) {
                        if (animal.getEnergia() > outroAnimal.getEnergia()) {
                            System.out.println("O Lobo caçou o Coelho!");
                        } else {
                            System.out.println("O Coelho conseguiu escapar do Lobo!");
                        }
                    } 
            }
        }  
    }
}
    public static void finalizarDia(Animal... animais) {
        System.out.println("Os animais começaram a descansar");

        for (int i = 0; i < animais.length; i++) {
            Animal animal = animais[i];
            animal.dormir();
        }
    }
}