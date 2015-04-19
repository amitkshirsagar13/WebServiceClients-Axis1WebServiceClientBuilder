package org.webservices.testclients;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherLocator;
import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap12Stub;
import com.cdyne.ws.weatherws.WeatherSoap_BindingStub;

public class AxisWebServiceClientTest {

	public static void main(String[] args) throws RemoteException, ServiceException, MalformedURLException {
		WeatherLocator weatherLocator = new WeatherLocator();
		weatherLocator.setWeatherSoap12EndpointAddress("http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL");
		WeatherSoap12Stub weatherStub = new WeatherSoap12Stub(new URL("http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL"),weatherLocator);
		
		WeatherReturn weatherReturn = weatherStub.getCityWeatherByZIP("38125");
		
		System.out.println(weatherReturn.getDescription());
	}
}
