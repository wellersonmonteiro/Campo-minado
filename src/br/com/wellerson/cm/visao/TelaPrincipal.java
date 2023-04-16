package br.com.wellerson.cm.visao;

import br.com.wellerson.cm.modelo.Tabuleiro;

import javax.swing.*;

@SuppressWarnings("serial")
public class TelaPrincipal  extends JFrame {
    public TelaPrincipal(){
        Tabuleiro tabuleiro = new Tabuleiro(16,30, 50);
        PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);

        add(painelTabuleiro);

        setSize(690,438);
        setTitle("Campo Minado");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String []args){
        new TelaPrincipal();
    }
}
