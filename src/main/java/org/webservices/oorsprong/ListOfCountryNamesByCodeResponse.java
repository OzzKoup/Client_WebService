
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
 *         &lt;element name="ListOfCountryNamesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/&gt;
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
    "listOfCountryNamesByCodeResult"
})
@XmlRootElement(name = "ListOfCountryNamesByCodeResponse")
public class ListOfCountryNamesByCodeResponse {

    @XmlElement(name = "ListOfCountryNamesByCodeResult", required = true)
    protected ArrayOftCountryCodeAndName listOfCountryNamesByCodeResult;

    /**
     * Gets the value of the listOfCountryNamesByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getListOfCountryNamesByCodeResult() {
        return listOfCountryNamesByCodeResult;
    }

    /**
     * Sets the value of the listOfCountryNamesByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setListOfCountryNamesByCodeResult(ArrayOftCountryCodeAndName value) {
        this.listOfCountryNamesByCodeResult = value;
    }

}
