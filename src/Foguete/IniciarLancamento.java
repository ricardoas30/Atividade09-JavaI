package Foguete;

import java.util.GregorianCalendar;

/**
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 * Atividade 09 - Revisão de Conteúdo | Item 14.a, 14.b, 14.c
 */
public class IniciarLancamento {
    static GregorianCalendar dataLancamento = new GregorianCalendar();
    static int dia = dataLancamento.get(dataLancamento.DAY_OF_MONTH); 
    static int mes = dataLancamento.get(dataLancamento.MONTH)+1; 
    static int ano = dataLancamento.get(dataLancamento.YEAR); 
    
    public static void main(String[] args) {
        BaseLancamento capcom = new BaseLancamento();
        
        // dados de lançamento
        capcom.setLocalLanc("Cabo Canaveral - Flórida");
        capcom.setDataLanc(dia + "/" + mes + "/" + ano);
        capcom.setCheckLanc("check lançamento OK");
        capcom.setAlturaBase(109);
        capcom.setLiberacaoLanc("Sim");
        capcom.setAbortarLanc("Não");
        // dados astronautas
        String[] astronautas = {"Nome: Jessica Ulrika Meir",String.valueOf("Idade: " + 44 + " anos"),String.valueOf("Peso: " + 79 + " Kg"),
                                "\nNome: Douglas Gerald Hurley",String.valueOf("Idade: " + 55 + " anos"),String.valueOf("Peso: " + 85 + " Kg")};
        
        // inicio de lançamento
        capcom.setCheckFoguete("OK");
        capcom.setQtdeCombEstSolido(150);
        capcom.setEstagiosFoguete(3);
        capcom.setAbortarMissao("Não");
        capcom.setLigarMotores("Sim");
        // imprimir
        capcom.dadosLancamento();
        capcom.dadosAstronautas(astronautas);
        capcom.comunicacao();
        capcom.iniciarLancamento();
        capcom.T1();
    }
}
