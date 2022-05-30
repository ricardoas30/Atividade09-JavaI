package Foguete;

/**
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 * Atividade 09 - Revisão de Conteúdo | Item 14.a, 14.b, 14.c
 */
public class Astronautas {
    private String nome;
    private int idade;
    private double peso;
    
    public void dadosAstronautas(String[] astronautas) {
        System.out.println("\n*********************************************************\n"
            + "            A S T R O N A U T A S " 
            + "\n*********************************************************\n");
            for(int i=0; i < astronautas.length; i++) {
                System.out.println(astronautas[i]);
            }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
