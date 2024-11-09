//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.08 at 10:38:12 PM EET 
//


package generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperatorName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Payroll" type="{}PayrollType"/&gt;
 *         &lt;element name="CallPrices" type="{}CallPricesType"/&gt;
 *         &lt;element name="SMSPrice" type="{}PayrollType"/&gt;
 *         &lt;element name="Parameters" type="{}ParametersType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffType", propOrder = {
    "name",
    "operatorName",
    "payroll",
    "callPrices",
    "smsPrice",
    "parameters"
})
public class TariffType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OperatorName", required = true)
    protected String operatorName;
    @XmlElement(name = "Payroll", required = true)
    protected PayrollType payroll;
    @XmlElement(name = "CallPrices", required = true)
    protected CallPricesType callPrices;
    @XmlElement(name = "SMSPrice", required = true)
    protected PayrollType smsPrice;
    @XmlElement(name = "Parameters", required = true)
    protected ParametersType parameters;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the payroll property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollType }
     *     
     */
    public PayrollType getPayroll() {
        return payroll;
    }

    /**
     * Sets the value of the payroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollType }
     *     
     */
    public void setPayroll(PayrollType value) {
        this.payroll = value;
    }

    /**
     * Gets the value of the callPrices property.
     * 
     * @return
     *     possible object is
     *     {@link CallPricesType }
     *     
     */
    public CallPricesType getCallPrices() {
        return callPrices;
    }

    /**
     * Sets the value of the callPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallPricesType }
     *     
     */
    public void setCallPrices(CallPricesType value) {
        this.callPrices = value;
    }

    /**
     * Gets the value of the smsPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollType }
     *     
     */
    public PayrollType getSMSPrice() {
        return smsPrice;
    }

    /**
     * Sets the value of the smsPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollType }
     *     
     */
    public void setSMSPrice(PayrollType value) {
        this.smsPrice = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersType }
     *     
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersType }
     *     
     */
    public void setParameters(ParametersType value) {
        this.parameters = value;
    }

}