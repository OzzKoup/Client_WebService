package org.client.soap.exception;


/**
 * Exception class. Exception will through when would some issues while write Web Service data to file.
 *
 * @author Temchenko Yaroslav
 */

public class WriteFileException extends RuntimeException {

    public WriteFileException(String massage) {
        super(massage);
    }

    public WriteFileException(String massage, Throwable cause) {
        super(massage, cause);
    }
}
