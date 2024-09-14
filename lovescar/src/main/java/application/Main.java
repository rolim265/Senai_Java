package application;

import db.DB;
import util.DBAcesso;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância da classe DBAcesso para acessar o banco de dados
        DBAcesso acesso = new DBAcesso();

        // Chama o método para inserir dados na tabela 'vendedor'
        acesso.inserirDados();

        // Adicione qualquer outro código necessário aqui, se houver
        // Por exemplo, você pode querer chamar acesso.Consulta() para visualizar os dados inseridos

        // Fecha a conexão com o banco de dados ao final da execução
        DB.closeConnection();
    }
}

