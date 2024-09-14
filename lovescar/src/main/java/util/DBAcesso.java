package util;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DBAcesso {

    // Método para consultar dados da tabela 'departamento'
    public void Consulta(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // Obtém uma conexão com o banco de dados
            conn = DB.getConnection();

            // Cria um Statement para executar a consulta SQL
            st = conn.createStatement();

            // Executa a consulta SQL para selecionar todos os registros da tabela 'departamento'
            rs = st.executeQuery("SELECT * FROM departamento");

            // Itera sobre os resultados e imprime cada registro
            while (rs.next()) {
                System.out.printf("%d, %s\n", rs.getInt("Id"), rs.getString("Nome"));
            }
        } catch (SQLException e) {
            // Lança uma exceção personalizada em caso de erro SQL
            throw new DbException(e.getMessage());
        } finally {
            // Fecha o Statement e a conexão, garantindo que sejam fechados mesmo em caso de erro
            DB.closeStatement(st);
            DB.closeResultSet(rs); // Corrigido para fechar o ResultSet
            DB.closeConnection();
        }
    }

    // Método para inserir dados na tabela 'vendedor'
    public void inserirDados(){
        Connection conn = null;
        PreparedStatement ps = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Obtém uma conexão com o banco de dados
            conn = DB.getConnection();

            // Cria um PreparedStatement para inserir dados na tabela 'vendedor'
            ps = conn.prepareStatement(
                    "INSERT INTO vendedor " +
                            "(Nome, Email, Aniversario, salarioBase, DepartamentoId) " +
                            "VALUES (?, ?, ?, ?, ?)"
            );

            // Define os valores dos parâmetros do PreparedStatement
            ps.setString(1, "Amanda");
            ps.setString(2, "amandinha@gmail.com"); // Corrigido para ter um domínio de e-mail válido
            ps.setDate(3, new java.sql.Date(sdf.parse("11/12/2008").getTime()));
            ps.setDouble(4, 1500);
            ps.setInt(5, 4);

            // Executa a atualização (inserção) no banco de dados
            ps.executeUpdate();

        } catch (SQLException | ParseException e) {
            // Lança uma exceção personalizada em caso de erro SQL ou de parsing
            throw new DbException(e.getMessage());
        } finally {
            // Fecha o PreparedStatement e a conexão, garantindo que sejam fechados mesmo em caso de erro
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}
