package br.com.alura.screenmatch.exception;

public class YearOfReleaseConversionException extends RuntimeException {
    private String message;

    public YearOfReleaseConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
