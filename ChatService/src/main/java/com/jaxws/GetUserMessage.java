
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.13
 * Fri Mar 25 22:04:23 CST 2022
 * Generated source version: 3.3.13
 */

@XmlRootElement(name = "getUserMessage", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserMessage", namespace = "http://com/")

public class GetUserMessage {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}
