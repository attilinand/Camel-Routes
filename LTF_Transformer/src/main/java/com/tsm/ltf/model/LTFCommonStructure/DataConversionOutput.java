//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.30 at 08:48:32 PM IST 
//


package com.tsm.ltf.model.LTFCommonStructure;

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
 *         &lt;element ref="{}DataToConvert"/>
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
    "dataToConvert"
})
@XmlRootElement(name = "DataConversionOutput")
public class DataConversionOutput {

    @XmlElement(name = "DataToConvert", required = true)
    protected DataToConvert dataToConvert;

    /**
     * Gets the value of the dataToConvert property.
     * 
     * @return
     *     possible object is
     *     {@link DataToConvert }
     *     
     */
    public DataToConvert getDataToConvert() {
        return dataToConvert;
    }

    /**
     * Sets the value of the dataToConvert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataToConvert }
     *     
     */
    public void setDataToConvert(DataToConvert value) {
        this.dataToConvert = value;
    }

}
