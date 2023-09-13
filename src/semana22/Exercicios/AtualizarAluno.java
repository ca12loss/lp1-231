package semana22.Exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/LP1?user=root&password=ditto&useSSL=true";
        String usuario = "root";
        String senha = "ditto";
        
        try {
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ID do aluno que deseja atualizar: ");
            int idAluno = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Digite o novo nome do aluno: ");
            String novoNome = scanner.nextLine();
            
            System.out.print("Digite o novo email do aluno: ");
            String novoEmail = scanner.nextLine();
            
            System.out.print("Digite o novo status (ativo ou inativo): ");
            String novoStatus = scanner.nextLine();
            
            String sql = "UPDATE Aluno SET Nome = ?, Email = ?, Ativo = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setString(2, novoEmail);
            stmt.setString(3, novoStatus);
            stmt.setInt(4, idAluno);
            
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Aluno atualizado com sucesso.");
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
