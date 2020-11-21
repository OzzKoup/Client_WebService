package org.client.soap.exception;

/**
 * Exception class. Exception will through when would some issues while reading Web Service data.
 *
 * @author Temchenko Yaroslav
 */

public class ReadDataException extends RuntimeException {

    public ReadDataException(String massage) {
        super(massage);
    }

    public ReadDataException(String massage, Throwable cause) {
        super(massage, cause);
    }
}
