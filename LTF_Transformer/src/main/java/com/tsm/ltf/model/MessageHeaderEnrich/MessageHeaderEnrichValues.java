//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.29 at 08:09:16 PM IST 
//


package com.tsm.ltf.model.MessageHeaderEnrich;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}MessageHeaderEnrichValueKey"/>
 *         &lt;element ref="{}MessageHeaderEnrichValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageHeaderEnrichValueKey",
    "messageHeaderEnrichValue"
})
@XmlRootElement(name = "MessageHeaderEnrichValues")
public class MessageHeaderEnrichValues {

    @XmlElement(name = "MessageHeaderEnrichValueKey", required = true)
    protected String messageHeaderEnrichValueKey;
    @XmlElement(name = "MessageHeaderEnrichValue", required = true)
    protected String messageHeaderEnrichValue;

    /**
     * Gets the value of the messageHeaderEnrichValueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageHeaderEnrichValueKey() {
        return messageHeaderEnrichValueKey;
    }

    /**
     * Sets the value of the messageHeaderEnrichValueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageHeaderEnrichValueKey(String value) {
        this.messageHeaderEnrichValueKey = value;
    }

    /**
     * Gets the value of the messageHeaderEnrichValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageHeaderEnrichValue() {
        return messageHeaderEnrichValue;
    }

    /**
     * Sets the value of the messageHeaderEnrichValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageHeaderEnrichValue(String value) {
        this.messageHeaderEnrichValue = value;
    }

}
