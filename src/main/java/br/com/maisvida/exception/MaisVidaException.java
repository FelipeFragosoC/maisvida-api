package br.com.maisvida.exception;

import java.text.MessageFormat;

public class MaisVidaException extends Exception {

    public MaisVidaException() {
        super();
    }

    public MaisVidaException(String msg) {
        super(msg);
    }

    public MaisVidaException(String msg, Exception e) {
        super(msg, e);
    }

    public MaisVidaException(Exception e) {
        super(e);
    }

    public MaisVidaException(String msg, Object... params) {
        super(MessageFormat.format(msg, params));
    }

}
