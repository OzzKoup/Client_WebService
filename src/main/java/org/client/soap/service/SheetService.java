package org.client.soap.service;


import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.client.soap.xls.SheetColumnName;
import org.client.soap.xls.XlsWorkbookConfiguration;

import org.webservices.oorsprong.TCountryInfo;

import java.util.Arrays;
import java.util.List;


/**
 * This class build XLS WorkBook and fill out the data from SOAP service by CountryInfoServiceHandler.
 *
 * @author Temchenko Yaroslav
 * @return HSSFWorkbook
 * @see CountryInfoServiceHandler
 */

public class SheetService {
    private static final Logger log = Logger.getLogger(SheetService.class);
    public static final String SHEET_NAME = "Countries information";


    /**
     * Method build and fill out workbook
     *
     * @return HSSFWorkbook
     * @author Temchenko Yaroslav
     * @see CountryInfoServiceHandler
     */

    public HSSFWorkbook buildWorkbook() {
        log.info("Enter method buildWorkbook");
        XlsWorkbookConfiguration xlsWorkbookConfiguration = new XlsWorkbookConfiguration();
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet(SHEET_NAME);
        log.info("Sheet was created with name : " + SHEET_NAME);
        fillSheetHeader(sheet);
        fillSheetData(sheet);
        xlsWorkbookConfiguration.changeWidthCell(sheet);
        log.info("WorkBook was generated successful");
        return workbook;
    }

    /**
     * Method fill out the sheet using CountryServiceHandler data.
     *
     * @author Temchenko Yaroslav
     * @see CountryInfoServiceHandler
     */

    private void fillSheetData(final HSSFSheet sheet) {
        log.info("Enter method fillSheetData");
        CountryInfoServiceHandler countryInfoServiceHandler = new CountryInfoServiceHandler();
        int counter = 0;
        int rowNumber = 1;
        for (TCountryInfo t : countryInfoServiceHandler.getWebServiceData()) {
            Row row = sheet.createRow(rowNumber);
            for (String s : separateWebDataToArray(t)) {
                row.createCell(counter).setCellValue(s);
                counter++;
            }
            counter = 0;
            rowNumber++;
        }
        log.info("Exit method fillSheetData");
    }

    /**
     * Method fill out sheet header cell names
     *
     * @author Temchenko Yaroslav
     * @see SheetColumnName
     */

    private void fillSheetHeader(final HSSFSheet sheet) {
        log.info("Enter method fillSheetHeader");
        Row row = sheet.createRow(0);
        for (SheetColumnName enumValue : SheetColumnName.values()) {
            row.createCell(enumValue.ordinal()).setCellValue(enumValue.getName());
        }
        log.info("Exit method fillSheetHeader");
    }


    /**
     * Service method to separate data and get that from WebService to List.
     *
     * @return List<String>
     * @author Temchenko Yaroslav
     */

    private List<String> separateWebDataToArray(final TCountryInfo tCountryInfo) {
        return Arrays.asList(
                tCountryInfo.getSISOCode(),
                tCountryInfo.getSName(),
                tCountryInfo.getSCapitalCity(),
                tCountryInfo.getSCurrencyISOCode(),
                tCountryInfo.getSPhoneCode());
    }
}
