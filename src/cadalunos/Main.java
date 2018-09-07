package cadalunos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Dao con = new Dao();   
            
            ArrayList resultado = con.QueryExecute("SELECT nome FROM tb_cliente");
            for(int i = 0; i < resultado.size(); i++) {
                System.out.println(resultado.get(i));
            }            
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}