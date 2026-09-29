import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase:");

        String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            resultado.append(i).append(" - ").append(frase).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
