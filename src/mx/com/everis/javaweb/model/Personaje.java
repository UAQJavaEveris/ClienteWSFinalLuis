/**
 * Personaje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.javaweb.model;

public class Personaje  implements java.io.Serializable {
    private long clave;

    private java.lang.String empresa;

    private java.lang.String nombre;

    public Personaje() {
    }

    public Personaje(
           long clave,
           java.lang.String empresa,
           java.lang.String nombre) {
           this.clave = clave;
           this.empresa = empresa;
           this.nombre = nombre;
    }


    /**
     * Gets the clave value for this Personaje.
     * 
     * @return clave
     */
    public long getClave() {
        return clave;
    }


    /**
     * Sets the clave value for this Personaje.
     * 
     * @param clave
     */
    public void setClave(long clave) {
        this.clave = clave;
    }


    /**
     * Gets the empresa value for this Personaje.
     * 
     * @return empresa
     */
    public java.lang.String getEmpresa() {
        return empresa;
    }


    /**
     * Sets the empresa value for this Personaje.
     * 
     * @param empresa
     */
    public void setEmpresa(java.lang.String empresa) {
        this.empresa = empresa;
    }


    /**
     * Gets the nombre value for this Personaje.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Personaje.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Personaje)) return false;
        Personaje other = (Personaje) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clave == other.getClave() &&
            ((this.empresa==null && other.getEmpresa()==null) || 
             (this.empresa!=null &&
              this.empresa.equals(other.getEmpresa()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getClave()).hashCode();
        if (getEmpresa() != null) {
            _hashCode += getEmpresa().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Personaje.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.javaweb.everis.com.mx", "Personaje"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.javaweb.everis.com.mx", "clave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.javaweb.everis.com.mx", "empresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.javaweb.everis.com.mx", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
