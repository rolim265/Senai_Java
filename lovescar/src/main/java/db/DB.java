package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

// Classe que fornece métodos estáticos para manipulação de conexões com o banco de dados
public class DB {

    // Conexão estática com o banco de dados
    private static Connection conn = null;

    // Obtém a conexão com o banco de dados
    public static Connection getConnection() {
        // Verifica se a conexão já foi criada
        if (conn == null) {
            try {
                // Carrega as propriedades de configuração do banco de dados
                Properties props = loadProperties();
                String url = props.getProperty("dburl");

                // Cria a conexão com o banco de dados usando as propriedades carregadas
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                // Lança uma exceção personalizada em caso de erro na conexão
                throw new DbException(e.getMessage());
            }
        }
        // Retorna a conexão
        return conn;
    }

    // Fecha a conexão com o banco de dados
    public static void closeConnection() {
        // Verifica se a conexão não é nula antes de tentar fechá-la
        if (conn != null) {
            try {
                // Fecha a conexão
                conn.close();
                // Define a conexão como nula após o fechamento
                conn = null;
            } catch (SQLException e) {
                // Lança uma exceção em caso de erro ao fechar a conexão
                throw new RuntimeException(e);
            }
        }
    }

    // Carrega as propriedades de configuração do banco de dados a partir de um arquivo
    public static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            // Carrega as propriedades do arquivo
            props.load(fs);
            return props;
        } catch (IOException e) {
            // Lança uma exceção personalizada em caso de erro ao carregar o arquivo de propriedades
            throw new DbException(e.getMessage());
        }
    }

    // Fecha o Statement passado como argumento
    public static void closeStatement(Statement st) {
        // Verifica se o Statement não é nulo antes de tentar fechá-lo
        if (st != null) {
            try {
                // Fecha o Statement
                st.close();
            } catch (SQLException e) {
                // Lança uma exceção personalizada em caso de erro ao fechar o Statement
                throw new DbException(e.getMessage());
            }
        }
    }

    // Fecha o ResultSet passado como argumento
    public static void closeResultSet(ResultSet rs) {
        // Verifica se o ResultSet não é nulo antes de tentar fechá-lo
        if (rs != null) {
            try {
                // Fecha o ResultSet
                rs.close();
            } catch (SQLException e) {
                // Lança uma exceção personalizada em caso de erro ao fechar o ResultSet
                throw new DbException(e.getMessage());
            }
        }
    }
}
