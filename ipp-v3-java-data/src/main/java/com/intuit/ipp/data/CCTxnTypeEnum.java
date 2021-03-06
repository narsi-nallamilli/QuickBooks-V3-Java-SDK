//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.23 at 07:53:50 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCTxnTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCTxnTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Authorization"/>
 *     &lt;enumeration value="Capture"/>
 *     &lt;enumeration value="Charge"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="VoiceAuthorization"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CCTxnTypeEnum")
@XmlEnum
public enum CCTxnTypeEnum {

    @XmlEnumValue("Authorization")
    AUTHORIZATION("Authorization"),
    @XmlEnumValue("Capture")
    CAPTURE("Capture"),
    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("VoiceAuthorization")
    VOICE_AUTHORIZATION("VoiceAuthorization");
    private final String value;

    CCTxnTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCTxnTypeEnum fromValue(String v) {
        for (CCTxnTypeEnum c: CCTxnTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
