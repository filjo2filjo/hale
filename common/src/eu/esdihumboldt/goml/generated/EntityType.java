//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.25 at 02:14:48 PM CEST 
//


package eu.esdihumboldt.goml.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omwg.org/TR/d7/ontology/alignment}label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.omwg.org/TR/d7/ontology/alignment}transf" minOccurs="0"/>
 *         &lt;element ref="{http://www.omwg.org/TR/d7/ontology/alignment}pipe" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}about"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityType", propOrder = {
    "label",
    "transf",
    "pipe"
})
public abstract class EntityType {

    @XmlElement(namespace = "http://www.omwg.org/TR/d7/ontology/alignment", required = true)
    protected List<String> label;
    @XmlElement(namespace = "http://www.omwg.org/TR/d7/ontology/alignment")
    protected FunctionType transf;
    @XmlElement(namespace = "http://www.omwg.org/TR/d7/ontology/alignment")
    protected TransfPipeType pipe;
    @XmlAttribute(namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")
    protected String about;

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLabel() {
        if (label == null) {
            label = new ArrayList<String>();
        }
        return this.label;
    }

    /**
     * Gets the value of the transf property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionType }
     *     
     */
    public FunctionType getTransf() {
        return transf;
    }

    /**
     * Sets the value of the transf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionType }
     *     
     */
    public void setTransf(FunctionType value) {
        this.transf = value;
    }

    /**
     * Gets the value of the pipe property.
     * 
     * @return
     *     possible object is
     *     {@link TransfPipeType }
     *     
     */
    public TransfPipeType getPipe() {
        return pipe;
    }

    /**
     * Sets the value of the pipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfPipeType }
     *     
     */
    public void setPipe(TransfPipeType value) {
        this.pipe = value;
    }

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }

}
