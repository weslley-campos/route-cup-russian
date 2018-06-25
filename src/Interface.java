import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    protected static JButton btnIniciar = new JButton("Iniciar");
    protected static JComboBox<String> comboOrigem = new JComboBox<>();
    protected static JComboBox<String> comboDestino = new JComboBox<>();
    protected static JLabel ecaterimburgo = new JLabel("ecaterimburgo;");
    protected static JLabel sao_petersburgo = new JLabel("sao_petersburgo;");
    protected static JLabel rostov = new JLabel("rostov;");
    protected static JLabel samara = new JLabel("samara;");
    protected static JLabel volgogrado = new JLabel("volgogrado;");
    protected static JLabel sochi = new JLabel("sochi;");
    protected static JLabel kazan = new JLabel("kazan;");
    protected static JLabel saransk = new JLabel("saransk;");
    protected static JLabel kalingrado = new JLabel("kalingrado;");
    protected static JLabel moscou = new JLabel("moscou;");
    protected static JLabel nijni_novgorod = new JLabel("nijni_novgorod;");

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

        comboOrigem.addItem("Kaliningrado");
        comboOrigem.addItem("Sao Petersburgo");
        comboOrigem.addItem("Moscou");
        comboOrigem.addItem("Saransk");
        comboOrigem.addItem("Nijni Novgorod");
        comboOrigem.addItem("Kazan");
        comboOrigem.addItem("Ecaterimburgo");
        comboOrigem.addItem("Samara");
        comboOrigem.addItem("Volgogrado");
        comboOrigem.addItem("Rostov");
        comboOrigem.addItem("Sochi");

        comboDestino.addItem("Kaliningrado");
        comboDestino.addItem("Sao Petersburgo");
        comboDestino.addItem("Moscou");
        comboDestino.addItem("Saransk");
        comboDestino.addItem("Nijni Novgorod");
        comboDestino.addItem("Kazan");
        comboDestino.addItem("Ecaterimburgo");
        comboDestino.addItem("Samara");
        comboDestino.addItem("Volgogrado");
        comboDestino.addItem("Rostov");
        comboDestino.addItem("Sochi");

        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Russia Cup Map");
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/imagens/telaIA2.png")));
        lblNewLabel.setBounds(0, 0, 994, 760);
        getContentPane().add(lblNewLabel);

        setVisible(true);
    }

    public void clearPath() {
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
        while (true) {
            switch (caminho.getPosition()) {
            case 0:
                kalingrado.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 1:
                sao_petersburgo.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 2:
                moscou.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 3:
                saransk.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 4:
                nijni_novgorod.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 5:
                kazan.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 6:
                ecaterimburgo.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 7:
                samara.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 8:
                volgogrado.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 9:
                rostov.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            case 10:
                sochi.setIcon(new ImageIcon(Interface.class.getResource("/imagens/point-green.png")));
                break;
            }
            if (caminho.getPai() == null)
                break;
            caminho = caminho.getPai();
        }

    }

    public static void main(String[] args) {

        // Inicializando interface
        Interface tela = new Interface();

        btnIniciar.addActionListener(e -> {
            tela.clearPath();
            tela.showPath(new UniformCustSearch()
                .uniformCustSearch(
                    comboOrigem.getSelectedIndex(),
                    comboDestino.getSelectedIndex())); 
        });
    }

}
