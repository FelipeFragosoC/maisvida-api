package br.com.maisvida.exception;

import java.text.MessageFormat;

public class MedicoNotFoundException extends Exception {

    public MedicoNotFoundException() {
        super();
    }

    public MedicoNotFoundException(String msg) {
        super(msg);
    }

    public MedicoNotFoundException(String msg, Exception e) {
        super(msg, e);
    }

    public MedicoNotFoundException(Exception e) {
        super(e);
    }

    public MedicoNotFoundException(String msg, Object... params) {
        super(MessageFormat.format(msg, params));
    }

}
