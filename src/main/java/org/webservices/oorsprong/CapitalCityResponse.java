
package org.webservices.oorsprong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapitalCityResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "capitalCityResult"
})
@XmlRootElement(name = "CapitalCityResponse")
public class CapitalCityResponse {

    @XmlElement(name = "CapitalCityResult", required = true)
    protected String capitalCityResult;

    /**
     * Gets the value of the capitalCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalCityResult() {
        return capitalCityResult;
    }

    /**
     * Sets the value of the capitalCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalCityResult(String value) {
        this.capitalCityResult = value;
    }

}
