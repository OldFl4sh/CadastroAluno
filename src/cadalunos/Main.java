package cadalunos;

import java.sql.ResultSet;
import views.Menu;

public class Main {
    public static Dao con;
    
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            
            menu.setVisible(true);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Dao Connection() throws Exception {
        Main.con = new Dao();
        
        return con;
    }
}