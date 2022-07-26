package com.kocesat.structural.decorator.mosh;

/**
 * Acts as a Decorator
 */
public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        stream.write(encrypt(data));
    }

    private String encrypt(String data) {
        return "d<%+^'+'@£#>£#";
    }
}
