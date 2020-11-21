package org.client.soap.xls;


/**
 * Enumeration of cell naming
 *
 * @author Temchenko Yaroslav
 * @return type of data
 */

public enum SheetColumnName implements ColumnName {

    ISO_CODE("ISO CODE"),
    COUNTRY_NAME("Country Name"),
    CAPITAL("The capital of country"),
    CURRENCY_CODE("Currency Code"),
    PHONE_CODE("Phone Code");

    private final String name;

    SheetColumnName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
