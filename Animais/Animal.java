package Animais;

public class Animal {
    // Atributos
    private String especie;
    private int idade;
    private int energia;
    private boolean carnivoro;
    private boolean fome;
    private boolean herbivoro;

    // Construtor
    public Animal(String especie, int idade, int energia, boolean carnivoro, boolean fome, boolean herbivoro, double velocidade) {
        this.especie = especie;
        this.idade = idade;
        this.energia = energia;
        this.carnivoro = carnivoro;
        this.fome = fome;
        this.herbivoro = herbivoro;
    }

    public Animal(String especie2, int idade2, int energia2, boolean carnivoro2, boolean fome2, boolean herbivoro2) {
    }

    // Métodos
    public void buscarComida() {
        if (fome) {
            System.out.println("O animal está procurando por comida.");
            fome = false;
        } else {
            System.out.println("O animal não está com fome no momento.");
        }
    }
    public void Atributos() {
        System.out.println("Atributos:");
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
        System.out.println("Carnívoro: " + carnivoro);
        System.out.println("Fome: " + fome);
        System.out.println("Herbívoro: " + herbivoro);
    }

    public void dormir() {
        System.out.println("O animal está cansado e vai dormir.");
    }

    public void acordar() {
        System.out.println("O animal acordou.");
    }

    public int getEnergia() {
        return 0;
    }
}