package org.client.soap;


import org.client.soap.xls.XlsFileBuilder;


public class Application {
    public static void main(String[] args) {
        XlsFileBuilder fileBuilder = new XlsFileBuilder();
        fileBuilder.generateXlsFile();
    }
}
