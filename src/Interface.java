import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    private static JButton btnIniciar = new JButton("Iniciar");
    private static JComboBox<String> comboOrigem = new JComboBox<>();
    private static JComboBox<String> comboDestino = new JComboBox<>();

    private static JLabel ecaterimburgo = new JLabel("ecaterimburgo;");
    private static JLabel sao_petersburgo = new JLabel("sao_petersburgo;");
    private static JLabel rostov = new JLabel("rostov;");
    private static JLabel samara = new JLabel("samara;");
    private static JLabel volgogrado = new JLabel("volgogrado;");
    private static JLabel sochi = new JLabel("sochi;");
    private static JLabel kazan = new JLabel("kazan;");
    private static JLabel saransk = new JLabel("saransk;");
    private static JLabel kalingrado = new JLabel("kalingrado;");
    private static JLabel moscou = new JLabel("moscou;");
    private static JLabel nijni_novgorod = new JLabel("nijni_novgorod;");

    public Interface() {
        setTitle("World Cup Russia 2018");
        setSize(994, 760);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        ecaterimburgo.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        ecaterimburgo.setBounds(510, 513, 20, 27);
        getContentPane().add(ecaterimburgo);

        sao_petersburgo.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        sao_petersburgo.setBounds(232, 260, 20, 27);
        getContentPane().add(sao_petersburgo);

        rostov.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        rostov.setBounds(110, 541, 20, 27);
        getContentPane().add(rostov);

        samara.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        samara.setBounds(328, 530, 20, 27);
        getContentPane().add(samara);

        volgogrado.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        volgogrado.setBounds(195, 551, 20, 27);
        getContentPane().add(volgogrado);

        sochi.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        sochi.setBounds(54, 606, 20, 27);
        getContentPane().add(sochi);

        kazan.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        kazan.setBounds(421, 392, 20, 27);
        getContentPane().add(kazan);

        saransk.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        saransk.setBounds(272, 393, 20, 27);
        getContentPane().add(saransk);

        kalingrado.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        kalingrado.setBounds(52, 235, 20, 27);
        getContentPane().add(kalingrado);

        moscou.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        moscou.setBounds(219, 391, 20, 27);
        getContentPane().add(moscou);

        nijni_novgorod.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        nijni_novgorod.setBounds(317, 382, 20, 27);
        getContentPane().add(nijni_novgorod);

        comboOrigem.setMaximumRowCount(11);
        comboOrigem.setFont(new Font("Tahoma", Font.PLAIN, 14));
        comboOrigem.setBounds(840, 367, 130, 24);
        getContentPane().add(comboOrigem);

        comboDestino.setMaximumRowCount(11);
        comboDestino.setFont(new Font("Tahoma", Font.PLAIN, 14));
        comboDestino.setBounds(840, 408, 130, 24);
        getContentPane().add(comboDestino);

        btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnIniciar.setBounds(846, 465, 124, 30);
        getContentPane().add(btnIniciar);

        comboOrigem.addItem("Ecterimburgo");
        comboOrigem.addItem("Sao Petersburgo");
        comboOrigem.addItem("Rostov");
        comboOrigem.addItem("Samara");
        comboOrigem.addItem("Volgogrado");
        comboOrigem.addItem("Sochi");
        comboOrigem.addItem("Kazan");
        comboOrigem.addItem("Saransk");
        comboOrigem.addItem("Kalingrado");
        comboOrigem.addItem("Moscou");
        comboOrigem.addItem("Nijni_novgorod");

        comboDestino.addItem("Ecterimburgo");
        comboDestino.addItem("Sao Petersburgo");
        comboDestino.addItem("Rostov");
        comboDestino.addItem("Samara");
        comboDestino.addItem("Volgogrado");
        comboDestino.addItem("Sochi");
        comboDestino.addItem("Kazan");
        comboDestino.addItem("Saransk");
        comboDestino.addItem("Kalingrado");
        comboDestino.addItem("Moscou");
        comboDestino.addItem("Nijni_novgorod");

        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Russia Cup Map");
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/imagens/telaIA2.png")));
        lblNewLabel.setBounds(0, 0, 994, 760);
        getContentPane().add(lblNewLabel);

        setVisible(true);
    }
    
    public void clearPath(){
        ecaterimburgo.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        sao_petersburgo.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        rostov.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        samara.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        volgogrado.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        sochi.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        kazan.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        saransk.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        kalingrado.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        moscou.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
        nijni_novgorod.setIcon(new ImageIcon(getClass().getResource("/imagens/point-red.png")));
    }

    public void showPath(Cidade caminho) {

    }

    public static void main(String[] args) {

        Interface tela = new Interface();

        btnIniciar.addActionListener(e -> {
            int origem = comboOrigem.getSelectedIndex();
            int destino = comboDestino.getSelectedIndex();
            tela.showPath(new UniformCustSearch().uniformCustSearch(origem, destino));
        });
    }



       
}
