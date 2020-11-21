package org.client.soap.xls;

import org.apache.poi.hssf.usermodel.HSSFSheet;

/**
 * This class change cell`s width of sheet by auto detecting.
 *
 * @author Temchenko Yaroslav
 * @see SheetColumnName
 */

public class XlsWorkbookConfiguration {
    public void changeWidthCell(final HSSFSheet sheet) {
        for (int i = 0; i < SheetColumnName.values().length; i++) {
            sheet.autoSizeColumn(i);
        }
    }
}
