/**
 * Weather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.weatherws;

public interface Weather extends javax.xml.rpc.Service {
    public java.lang.String getWeatherSoap12Address();

    public com.cdyne.ws.weatherws.WeatherSoap_PortType getWeatherSoap12() throws javax.xml.rpc.ServiceException;

    public com.cdyne.ws.weatherws.WeatherSoap_PortType getWeatherSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getWeatherSoapAddress();

    public com.cdyne.ws.weatherws.WeatherSoap_PortType getWeatherSoap() throws javax.xml.rpc.ServiceException;

    public com.cdyne.ws.weatherws.WeatherSoap_PortType getWeatherSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
