import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame {
    private JTextField num_one, num_two;
    private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    private JLabel resultadoLabel;

    public CalculadoraGUI(){
        setTitle("Calculadora");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        add(new JLabel("Numero 01"));
        num_one = new JTextField();
        add(num_one);

        add(new JLabel("Numero 02"));
        num_two = new JTextField();
        add(num_two);

        btnSomar = new JButton("Somar");
        btnSubtrair = new JButton("Subtrair");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");

        add(btnSomar);
        add(btnSubtrair);
        add(btnMultiplicar);
        add(btnDividir);

        resultadoLabel = new JLabel("Resultado: ");
        add(resultadoLabel);

        btnSomar.addActionListener(e -> calcular("+"));
        btnSubtrair.addActionListener(e -> calcular("-"));
        btnMultiplicar.addActionListener(e -> calcular("x"));
        btnDividir.addActionListener(e -> calcular("/"));

        setVisible(true);

    }

    private void calcular(String operacao) {
        double num1 = Double.parseDouble(num_one.getText());
        double num2 = Double.parseDouble(num_two.getText());
        double resultado = 0;

        switch (operacao) {
            case "+" : resultado = num1 + num2;
                break;
            case "-" : resultado = num1 - num2;
                break;
            case "x" : resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    resultadoLabel.setText("ERRO");
                    return;
                }
                resultado = num1 / num2;
                break;
        }
        resultadoLabel.setText("Resultado: " + resultado);

    }

    public static void main(String[] args) {
        new CalculadoraGUI();
    }
}
