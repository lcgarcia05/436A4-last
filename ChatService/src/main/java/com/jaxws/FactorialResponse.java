
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.13
 * Wed Apr 13 05:02:33 CST 2022
 * Generated source version: 3.3.13
 */

@XmlRootElement(name = "factorialResponse", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factorialResponse", namespace = "http://com/")

public class FactorialResponse {

    @XmlElement(name = "return")
    private long _return;

    public long getReturn() {
        return this._return;
    }

    public void setReturn(long new_return)  {
        this._return = new_return;
    }

}

