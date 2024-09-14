package db;

// Classe personalizada para tratamento de exceções relacionadas ao banco de dados
public class DbException extends RuntimeException {

    // Construtor que recebe uma mensagem de erro e a passa para a superclasse
    public DbException(String mesg) {
        super(mesg);
    }

}
