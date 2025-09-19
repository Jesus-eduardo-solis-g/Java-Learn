import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm(){
        inicilizarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicilizarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);  //centramos la ventana
    }

    private void validar(){
        //leer los valores
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());
        if("root".equals(usuario) && "admin".equals(password))
            mostrarMensaje("Datos correctos, bienvenido!");
        else if("root".equals(usuario))
            mostrarMensaje("El password es incorrecto!, corregirlo");
        else
            mostrarMensaje("Usuario incorrecto!, corregirlo");
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);;
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
