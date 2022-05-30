package Super;

/**
 *
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 */
public class Cachorro extends Animal {
    String latido;
    String cor;
    
    @Override
    public void imprime() {
        this.setLatido("Au,Au,Au");
        this.setCor("Marrom e branco");
        
        System.out.println("Meu latido é " + getLatido() +
                " e tenho pelo da cor: " + getCor()
        );
        super.imprime();
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
