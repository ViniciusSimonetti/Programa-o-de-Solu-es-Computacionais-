import java.sql.Connection;
import javamysqlapp.ConnFactory;
import javax.swing.SwingUtilities;

public class Programa {
public static void main(String[] args) {
        
    SwingUtilities.invokeLater(() -> {
        TodoListApp app = new TodoListApp();
        app.setVisible(true);
        Connection conn = ConnFactory.getConn();
    });
  
    
}
}
