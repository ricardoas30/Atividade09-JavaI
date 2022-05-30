package Super;

/**
 *
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 */
public class Galinha extends Animal {
    String cacarejo;
    String penas;
    
    @Override
    public void imprime() {
        this.setCacarejo("Có, có, rocóóó");
        this.setPenas("Brancas");
        System.out.println(
            "Eu faço " + cacarejo 
                + " minhas penas é de cor: " + penas
        );
    }

    public String getCacarejo() {
        return cacarejo;
    }

    public void setCacarejo(String cacarejo) {
        this.cacarejo = cacarejo;
    }

    public String getPenas() {
        return penas;
    }

    public void setPenas(String penas) {
        this.penas = penas;
    }
}
