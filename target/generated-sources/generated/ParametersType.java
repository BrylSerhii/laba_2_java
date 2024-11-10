//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.10 at 03:30:45 PM EET 
//


package generated;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FavoriteNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Tariffing" type="{}TariffingType"/&gt;
 *         &lt;element name="ConnectionFee" type="{}PayrollType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametersType", propOrder = {
    "favoriteNumber",
    "tariffing",
    "connectionFee"
})
public class ParametersType {

    @XmlElement(name = "FavoriteNumber")
    protected BigInteger favoriteNumber;
    @XmlElement(name = "Tariffing", required = true)
    protected String tariffing;
    @XmlElement(name = "ConnectionFee", required = true)
    protected PayrollType connectionFee;

    /**
     * Gets the value of the favoriteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFavoriteNumber() {
        return favoriteNumber;
    }

    /**
     * Sets the value of the favoriteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFavoriteNumber(BigInteger value) {
        this.favoriteNumber = value;
    }

    /**
     * Gets the value of the tariffing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffing() {
        return tariffing;
    }

    /**
     * Sets the value of the tariffing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffing(String value) {
        this.tariffing = value;
    }

    /**
     * Gets the value of the connectionFee property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollType }
     *     
     */
    public PayrollType getConnectionFee() {
        return connectionFee;
    }

    /**
     * Sets the value of the connectionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollType }
     *     
     */
    public void setConnectionFee(PayrollType value) {
        this.connectionFee = value;
    }

}
