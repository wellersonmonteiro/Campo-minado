package br.com.wellerson.cm.visao;

import br.com.wellerson.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro){
        setLayout(new GridLayout(tabuleiro.getLinhas(),tabuleiro.getColunas()));

       tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

       tabuleiro.registrarObservador(e -> {
           if (true
           ){

           }
       });

    }
}
