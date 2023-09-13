package semana22.Exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorId {
    public static void main(String[] args) {
         String url = "jdbc:mysql://127.0.0.1:3306/LP1?user=root&password=ditto&useSSL=true";
        String usuario = "root";
        String senha = "ditto";
        
        try {
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o ID do aluno: ");
            int idAluno = scanner.nextInt();

            String sql = "SELECT * FROM Aluno WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            
            ResultSet rs = stmt.executeQuery();
            
        if (rs.next()) {
                int matricula = rs.getInt("Matricula");
                String nome = rs.getString("Nome");
                String dataNascimento = rs.getString("DataNascimento");
                String curso = rs.getString("Curso");
                double notaMedia = rs.getDouble("NotaMedia");
                
                System.out.println("Dados do Aluno:");
                System.out.println("Matrícula: " + matricula);
                System.out.println("Nome: " + nome);
                System.out.println("Data de Nascimento: " + dataNascimento);
                System.out.println("Curso: " + curso);
                System.out.println("Nota Média: " + notaMedia);
            } else {
                System.out.println("Aluno não encontrado.");
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
