package TarefasManager;

import controler.ProjectController;
import java.sql.Connection;
import model.Project;
import util.ConnectionFactory;

public class Main {
    

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        //Project project = new Project();
       
        
      
        Connection c = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection(c);
    }

    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
