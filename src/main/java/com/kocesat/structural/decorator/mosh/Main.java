package com.kocesat.structural.decorator.mosh;

public class Main {
    public static void main(String[] args) {
        // Multiple Decoration
        storeCreditCard(
                new EncryptedCloudStream(
                        new CompressedCloudStream(
                                new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-8532-6454");
    }
}
