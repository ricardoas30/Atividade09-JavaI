package Foguete;

/**
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 * Atividade 09 - Revisão de Conteúdo | Item 14.a, 14.b, 14.c
 */
public class BaseLancamento extends Foguete {
    private String localLanc;
    private String dataLanc;
    private String checkLanc;
    private double alturaBase;
    private String liberacaoLanc;
    private String abortarLanc;

    public void dadosLancamento() {
        System.out.println("***********************************************\n"
                         + "    D A D O S   D O   L A N Ç A M E N T O" 
                         + "\n***********************************************\n" + 
                  "Local: " + getLocalLanc() 
                + "\nData Lançamento: " + getDataLanc() 
                + "\n" + getCheckLanc() 
                + "\nAltura Base Lançamento: " + getAlturaBase() + " metros"
                + "\nLiberar Lançamento: " + getLiberacaoLanc() 
                + "\nAbortar Lançamento: " + getAbortarLanc());
    }
    
    /**
     * Metodo: Polimorfismo por Sobrescrita, metodo
     * de comunicação entre a base de lançamento
     * e o foguete.
     * Classe: Classe mãe
     */
    @Override
    public void comunicacao() {
        System.out.println("\n*********************************************************\n"
                         + "  C O M U N I C A Ç Ã O   B A S E   L A N Ç A M E N T O" 
                         + "\n*********************************************************\n"
                + "CAPCOM iniciando comunicação, chamando astronautas...");
        super.comunicacao();
    }
    
    public void T1() {
        System.out.println("\n*********************************************************\n"
             + "       C O N T A G E M   R E G R E S S I V A - T1   " 
             + "\n*********************************************************\n");
        
        for(int i=10; i > 0; i--) {
            System.out.println("T1 em ....." + i);
        }
        System.out.println("\nLaunch..., Astronautas, boa viagem ao espaço!!!");
    }
    
    public String getLocalLanc() {
        return localLanc;
    }

    public void setLocalLanc(String localLanc) {
        this.localLanc = localLanc;
    }

    public String getDataLanc() {
        return dataLanc;
    }

    public void setDataLanc(String dataLanc) {
        this.dataLanc = dataLanc;
    }

    public String getCheckLanc() {
        return checkLanc;
    }

    public void setCheckLanc(String checkLanc) {
        this.checkLanc = checkLanc;
    }

    public double getAlturaBase() {
        return alturaBase;
    }

    public void setAlturaBase(double alturaBase) {
        this.alturaBase = alturaBase;
    }

    public String getLiberacaoLanc() {
        return liberacaoLanc;
    }

    public void setLiberacaoLanc(String liberacaoLanc) {
        this.liberacaoLanc = liberacaoLanc;
    }

    public String getAbortarLanc() {
        return abortarLanc;
    }

    public void setAbortarLanc(String abortarLanc) {
        this.abortarLanc = abortarLanc;
    }
}
