/**
 * ArrayOfWeatherDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.weatherws;

public class ArrayOfWeatherDescription  implements java.io.Serializable {
    private com.cdyne.ws.weatherws.WeatherDescription[] weatherDescription;

    public ArrayOfWeatherDescription() {
    }

    public ArrayOfWeatherDescription(
           com.cdyne.ws.weatherws.WeatherDescription[] weatherDescription) {
           this.weatherDescription = weatherDescription;
    }


    /**
     * Gets the weatherDescription value for this ArrayOfWeatherDescription.
     * 
     * @return weatherDescription
     */
    public com.cdyne.ws.weatherws.WeatherDescription[] getWeatherDescription() {
        return weatherDescription;
    }


    /**
     * Sets the weatherDescription value for this ArrayOfWeatherDescription.
     * 
     * @param weatherDescription
     */
    public void setWeatherDescription(com.cdyne.ws.weatherws.WeatherDescription[] weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public com.cdyne.ws.weatherws.WeatherDescription getWeatherDescription(int i) {
        return this.weatherDescription[i];
    }

    public void setWeatherDescription(int i, com.cdyne.ws.weatherws.WeatherDescription _value) {
        this.weatherDescription[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfWeatherDescription)) return false;
        ArrayOfWeatherDescription other = (ArrayOfWeatherDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.weatherDescription==null && other.getWeatherDescription()==null) || 
             (this.weatherDescription!=null &&
              java.util.Arrays.equals(this.weatherDescription, other.getWeatherDescription())));
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
        if (getWeatherDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeatherDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeatherDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfWeatherDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ArrayOfWeatherDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
