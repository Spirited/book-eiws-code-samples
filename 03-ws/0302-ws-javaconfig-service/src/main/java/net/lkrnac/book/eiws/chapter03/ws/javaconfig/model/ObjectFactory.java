//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.03 at 06:34:36 PM GMT 
//


package net.lkrnac.book.eiws.chapter03.ws.javaconfig.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.lkrnac.book.eiws.chapter03.ws.javaconfig.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserDetails_QNAME = new QName("http://lkrnac.net/book/eiws/chapter03/ws/javaconfig/model", "UserDetails");
    private final static QName _Email_QNAME = new QName("http://lkrnac.net/book/eiws/chapter03/ws/javaconfig/model", "Email");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.lkrnac.book.eiws.chapter03.ws.javaconfig.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserDetailsType }
     * 
     */
    public UserDetailsType createUserDetailsType() {
        return new UserDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lkrnac.net/book/eiws/chapter03/ws/javaconfig/model", name = "UserDetails")
    public JAXBElement<UserDetailsType> createUserDetails(UserDetailsType value) {
        return new JAXBElement<UserDetailsType>(_UserDetails_QNAME, UserDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lkrnac.net/book/eiws/chapter03/ws/javaconfig/model", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

}