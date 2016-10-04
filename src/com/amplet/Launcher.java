package com.amplet;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    /**
     * Método principal que configurará a interface gráfica principal.
     * @param args
     */
    public static void main(String[] args) {
        // Cria uma instância de JFrame que servirá como container "raiz" da interface gráfica.
        JFrame frame = new JFrame("Projeto Amplet");
        // Configura a largura e altura do frame, passando uma nova instância da classe Dimension
        // (que recebe a largura e altura, respectivamente, em seu construtor) para o método setSize.
        frame.setSize(new Dimension(500,500));
        // Faz com que, ao fechar a interface gráfica, ele também feche a aplicação.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cria uma istância de JPnael que servirá como "painel de conteúdos" da interface gráfica.
        JPanel contentPane = new JPanel(new BorderLayout());
        // Cria um botão com o texto "Clique-me".
        JButton btn1 = new JButton("Clique-me");
        // Adiciona o botão btn1 ao contentPane com um alinhamento centralizado.
        contentPane.add(btn1, BorderLayout.CENTER);
        // Faz com que o contentPane seja o "painel de conteúdo" do container "raiz", o jframe.
        frame.setContentPane(contentPane);
        // Deixa o botão azul e sem bordas
        setBotaoAzulSemBordas(btn1);
        // Faz com que o container "raiz" seja vizível como interface gráfica.
        frame.setVisible(true);
    }

    /**
     * Método recebe uma instância de JButton e deixa sua cor de fundo azul e seu texto branco e sem bordas.
     * @param button Instância da classe JButton.
     */
    private static void setBotaoAzulSemBordas(JButton button){
        button.setBackground(getCorAzul());
        button.setForeground(getCorBranca());
        button.setBorder(BorderFactory.createLineBorder(getCorAzul(),20));
    }

    /**
     * Método recebe uma instância de JButton e deixa sua cor de fundo azul e seu texto branco.
     * @param button Instância da classe JButton.
     */
    private static void setBotaoAzul(JButton button){
        button.setBackground(getCorAzul());
        button.setForeground(getCorBranca());
    }

    /**
     * Retorna um instância da classe java.awt.Color com a configuração de cor branca
     * @return uma instância de Color com cor branca.
     */
    private static Color getCorBranca(){
        return new Color(255,255,255);
    }

    /**
     * Retorna um instância da classe java.awt.Color com a configuração de cor Azul
     * @return uma instância de Color com cor azul.
     */
    private static Color getCorAzul(){
        return new Color(0,0,255);
    }

}
