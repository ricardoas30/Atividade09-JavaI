package Super;

/**
 *
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 */
public class Animal {
    private String nome;
    private double peso;
    private double altura;
    
    public void imprime() {
        this.setNome("Spike");
        this.setPeso(29);
        this.setAltura(49);
        
        System.out.println("Me chamo: " + getNome() + 
                " com peso de " + getPeso() + " kg " +
                "e minha altura é de " + getAltura() + " cm"
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
