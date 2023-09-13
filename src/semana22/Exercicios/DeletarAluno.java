package semana22.Exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarAluno {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/LP1?user=root&password=ditto&useSSL=true";
        String usuario = "root";
        String senha = "ditto";
        
        try {
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ID do aluno que deseja deletar: ");
            int idAluno = scanner.nextInt();
            
            String sql = "DELETE FROM Aluno WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Aluno deletado com sucesso.");
            } else {
                System.out.println("Nenhum aluno encontrado com o ID informado.");
            }
            
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
