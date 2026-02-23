import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PedraPapelTesoura extends JFrame implements ActionListener {

    private JButton btnPedra, btnPapel, btnTesoura;
    private JLabel lblResultado, lblEscolhaComputador, lblPlacar;
    private int pontosJogador = 0;
    private int pontosComputador = 0;
    private Random random;

    public PedraPapelTesoura() {
        setTitle("Pedra, Papel e Tesoura");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        random = new Random();

        // Painel de botões
        JPanel painelBotoes = new JPanel();
        btnPedra = new JButton("Pedra");
        btnPapel = new JButton("Papel");
        btnTesoura = new JButton("Tesoura");

        btnPedra.addActionListener(this);
        btnPapel.addActionListener(this);
        btnTesoura.addActionListener(this);

        painelBotoes.add(btnPedra);
        painelBotoes.add(btnPapel);
        painelBotoes.add(btnTesoura);

        // Painel de informações
        JPanel painelInfo = new JPanel(new GridLayout(3, 1));
        lblEscolhaComputador = new JLabel("Computador ainda não jogou", SwingConstants.CENTER);
        lblResultado = new JLabel("Escolha sua jogada!", SwingConstants.CENTER);
        lblPlacar = new JLabel("Jogador: 0 | Computador: 0", SwingConstants.CENTER);

        painelInfo.add(lblEscolhaComputador);
        painelInfo.add(lblResultado);
        painelInfo.add(lblPlacar);

        add(painelInfo, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String jogador = e.getActionCommand();
        String computador = gerarJogadaComputador();

        lblEscolhaComputador.setText("Computador escolheu: " + computador);

        String resultado = verificarVencedor(jogador, computador);
        lblResultado.setText(resultado);

        lblPlacar.setText("Jogador: " + pontosJogador +
                " | Computador: " + pontosComputador);
    }

    private String gerarJogadaComputador() {
        int escolha = random.nextInt(3);
        switch (escolha) {
            case 0: return "Pedra";
            case 1: return "Papel";
            default: return "Tesoura";
        }
    }

    private String verificarVencedor(String jogador, String computador) {

        if (jogador.equals(computador)) {
            return "Empate!";
        }

        if ((jogador.equals("Pedra") && computador.equals("Tesoura")) ||
                (jogador.equals("Papel") && computador.equals("Pedra")) ||
                (jogador.equals("Tesoura") && computador.equals("Papel"))) {

            pontosJogador++;
            return "Você venceu!";
        } else {
            pontosComputador++;
            return "Computador venceu!";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PedraPapelTesoura().setVisible(true);
        });
    }
}