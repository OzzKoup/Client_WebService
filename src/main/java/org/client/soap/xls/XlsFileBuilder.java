package org.client.soap.xls;

import org.apache.log4j.Logger;
import org.client.soap.exception.WriteFileException;
import org.client.soap.service.SheetService;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Generate final xml file with filled out data by SheetService class
 *
 * @author Temchenko Yarosalv
 * @see SheetService
 */

public class XlsFileBuilder {
    private static final Logger log = Logger.getLogger(XlsFileBuilder.class);
    public static final String FILE_NAME = "Country info";

    public void generateXlsFile() {
        SheetService service = new SheetService();
        log.info("Enter method generateXlsFile()");
        log.info("Starting write data to file");
        try (FileOutputStream out = new FileOutputStream(new File(FILE_NAME + ".xls"))) {
            service.buildWorkbook().write(out);
        } catch (IOException e) {
            log.error("Error write down in file");
            throw new WriteFileException("Error write down in file");
        }
        log.info("File was created successfully, exit the method");
    }
}
