package com.nikesh.scheduler.view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * View for the login.
 *
 * @author Nikesh Maharjan
 */
public class LoginView extends JFrame {

    private JLabel lblUser, lblPass;
    private JTextField tfUser;
    private JPasswordField pfPass;
    private JButton btnLogin;

    /**
     * Constructor.
     */
    public LoginView() {
        super("Login");

        setLayout(null);

        setLookAndFeel();

        init();

        placeComponents();

        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    /**
     * Instantiates the GUI components.
     */
    private void init() {
        lblUser = new JLabel("Username");
        lblUser.setBounds(10, 10, 80, 25);
        lblPass = new JLabel("Password");
        lblPass.setBounds(10, 40, 80, 25);
        tfUser = new JTextField(10);
        tfUser.setBounds(100, 10, 160, 25);
        pfPass = new JPasswordField(10);
        pfPass.setBounds(100, 40, 160, 25);
        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 80, 110, 25);
    }

    /**
     * Places the GUI components.
     */
    private void placeComponents() {
        add(lblUser);
        add(lblPass);

        add(tfUser);
        add(pfPass);

        add(btnLogin);
    }

    /*public static void main(String[] args) {
     new LoginView();
     }*/
    private void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void addButtonListener(ActionListener listener) {
        btnLogin.addActionListener(listener);
    }

    public String getUsername() {
        return tfUser.getText();
    }

    public String getPassword() {
        return String.valueOf(pfPass.getPassword());
    }
    
    public void showError(){
        JOptionPane.showMessageDialog(this, "Incorrect username or password.", "Login Failed.", JOptionPane.ERROR_MESSAGE);
    }
}
