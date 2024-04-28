
public class Main {
    String username, password;

    public static void main(String[] args) {
        // TODO : CODE START HERE
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginPage frame = new LoginPage();
                frame.setVisible(true);
            }
        });

    }
}
