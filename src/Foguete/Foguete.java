package Foguete;

/**
 *@author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 * Atividade 09 - Revisão de Conteúdo | Item 14.a, 14.b, 14.c
 */
public class Foguete extends Astronautas {
    private String ligarMotores;
    private int QtdeCombEstSolido;
    private String checkFoguete;
    private int estagiosFoguete;
    private String abortarMissao;

    /**
     * Metodo: Polimorfismo por Sobrescrita, metodo
     * de comunicacao entre o foguete e a base de 
     * lançamento.
     * Classe: Subclasse
     */
    public void comunicacao() {
        System.out.println("\n*********************************************************\n"
                     + "  C O M U N I C A Ç Ã O   M Ó D U L O   F O G U E T E " 
                     + "\n*********************************************************\n"
            + "Astronautas no módulo de foguete. Copiando a mensagem, CAPCOM. OK. "
                + "\niniciar o procedimento de lançamento...");
    }
    
    public void iniciarLancamento() {
        System.out.println("\n*****************************************************************\n"
                 + "      P R O C E D I M E N T O S   D E   L A N Ç A M E N T O  " 
                 + "\n*****************************************************************\n"
        + "Check de Foguete: " + getCheckFoguete()
            + "\nCombustível Estado Sólido: " + getQtdeCombEstSolido()+ " Milhões de litros, OK"
                + "\nSeparação em: " + getEstagiosFoguete() + " estágios, OK"
                + "\nAtivar Propulsores: " + getLigarMotores()
                + "\nAbortar Missão: " + getAbortarMissao()
        );
    }
    
    public String getLigarMotores() {
        return ligarMotores;
    }

    public void setLigarMotores(String ligarMotores) {
        this.ligarMotores = ligarMotores;
    }

    public int getQtdeCombEstSolido() {
        return QtdeCombEstSolido;
    }

    public void setQtdeCombEstSolido(int QtdeCombEstSolido) {
        this.QtdeCombEstSolido = QtdeCombEstSolido;
    }

    public String getCheckFoguete() {
        return checkFoguete;
    }

    public void setCheckFoguete(String checkFoguete) {
        this.checkFoguete = checkFoguete;
    }

    public int getEstagiosFoguete() {
        return estagiosFoguete;
    }

    public void setEstagiosFoguete(int estagiosFoguete) {
        this.estagiosFoguete = estagiosFoguete;
    }

    public String getAbortarMissao() {
        return abortarMissao;
    }

    public void setAbortarMissao(String abortarMissao) {
        this.abortarMissao = abortarMissao;
    }
}
