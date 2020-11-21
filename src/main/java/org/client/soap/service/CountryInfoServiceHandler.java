package org.client.soap.service;

import org.apache.log4j.Logger;
import org.client.soap.exception.ReadDataException;
import org.webservices.oorsprong.CountryInfoService;
import org.webservices.oorsprong.TCountryInfo;

import java.util.List;

/**
 * Returns list wih data from Web Service.
 *
 * @author Temchenko Yaroslav
 * @return List<TCountryInfo>
 * @see CountryInfoService
 */

public class CountryInfoServiceHandler {
    private static final Logger log = Logger.getLogger(CountryInfoServiceHandler.class);
    private CountryInfoService countryInfoService = new CountryInfoService();

    public List<TCountryInfo> getWebServiceData() {
        try {
            return countryInfoService.getCountryInfoServiceSoap()
                    .fullCountryInfoAllCountries()
                    .getTCountryInfo();
        } catch (Exception e) {
            log.error("Error reading service");
            throw new ReadDataException("Error reading service", e);
        }
    }
}
