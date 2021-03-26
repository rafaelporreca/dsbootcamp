package br.com.rafaelporreca.dsbootcamp.servicies.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }
}
