
package com.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.13
 * Thu Mar 24 22:35:30 CST 2022
 * Generated source version: 3.3.13
 */

@XmlRootElement(name = "getChatUsersResponse", namespace = "http://com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChatUsersResponse", namespace = "http://com/")

public class GetChatUsersResponse {

    @XmlElement(name = "return")
    private java.util.List<com.User> _return;

    public java.util.List<com.User> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<com.User> new_return)  {
        this._return = new_return;
    }

}

