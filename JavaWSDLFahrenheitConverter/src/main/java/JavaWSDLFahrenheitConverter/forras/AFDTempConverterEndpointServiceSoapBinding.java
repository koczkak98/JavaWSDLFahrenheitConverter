package JavaWSDLFahrenheitConverter.forras;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.10.3.0
//
// Created by Quasar Development 
//
//----------------------------------------------------





import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.*;
import org.ksoap2.transport.*;
import org.kxml2.kdom.Element;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AFDTempConverterEndpointServiceSoapBinding
{
    interface AFDIWcfMethod
    {
        AFDExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws Exception;

        Object ProcessResult(AFDExtendedSoapSerializationEnvelope __envelope, Object result) throws Exception;
    }

    String url="http://www.learnwebservices.com/services/tempconverter";

    int timeOut=60000;
    
    public List< HeaderProperty> httpHeaders= new ArrayList< HeaderProperty>();
    public boolean enableLogging;


    public AFDTempConverterEndpointServiceSoapBinding(){}

    public AFDTempConverterEndpointServiceSoapBinding(String url)
    {
        this.url = url;
    }

    public AFDTempConverterEndpointServiceSoapBinding(String url,int timeOut)
    {
        this.url = url;
        this.timeOut=timeOut;
    }

    protected org.ksoap2.transport.Transport createTransport()
    {
        try
        {
            java.net.URI uri = new java.net.URI(url);
            if(uri.getScheme().equalsIgnoreCase("https"))
            {
                int port=uri.getPort()>0?uri.getPort():443;
                String path=uri.getPath();
                if(uri.getQuery()!=null && uri.getQuery()!="")
                {
                    path+="?"+uri.getQuery();
                }
                return new com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE(uri.getHost(), port, path, timeOut);
            }
            else
            {
                return new com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE(url,timeOut);
            }

        }
        catch (java.net.URISyntaxException e)
        {
        }
        return null;
    }

    protected AFDExtendedSoapSerializationEnvelope createEnvelope()
    {
        AFDExtendedSoapSerializationEnvelope envelope= new AFDExtendedSoapSerializationEnvelope(AFDExtendedSoapSerializationEnvelope.VER11);
            return envelope;
    }

    protected List sendRequest(String methodName,AFDExtendedSoapSerializationEnvelope envelope,org.ksoap2.transport.Transport transport ,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile )throws Exception
    {
        if(transport instanceof com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE )
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
        else
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
    }

    Object getResult(Class destObj, Object source, String resultName, AFDExtendedSoapSerializationEnvelope __envelope) throws Exception
    {
        if(source==null)
        {
            return null;
        }
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                Object instance=__envelope.get(j,destObj,false);
                return instance;
            }
            else if( soap.getName().equals(resultName)) 
            {
                Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }

        return null;
    }

    
    
    
    public Double CelsiusToFahrenheit(final Double TemperatureInCelsius) throws Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (Double)execute(new AFDIWcfMethod()
        {
            @Override
            public AFDExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                AFDExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://learnwebservices.com/services/tempconverter", "CelsiusToFahrenheitRequest");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://learnwebservices.com/services/tempconverter";
                __info.name="TemperatureInCelsius";
                __info.type=Double.class;
                __info.setValue(TemperatureInCelsius);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public Object ProcessResult(AFDExtendedSoapSerializationEnvelope __envelope, Object __result)throws Exception {
                SoapObject __soap=(SoapObject)__result;
                Object obj = __soap.getProperty("TemperatureInFahrenheit");
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    return Double.valueOf(j.toString());
                }
                else if (obj!= null && obj instanceof Double){
                    return (Double)obj;
                }
                return null;
            }
        },"",__profile);
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    
    
    public String FahrenheitToCelsius(final String TemperatureInFahrenheit) throws Exception
    {
        
/*This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.*/
        throw new UnsupportedOperationException("This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.");
    }

    protected Object execute(AFDIWcfMethod wcfMethod,String methodName,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile) throws Exception
    {
        org.ksoap2.transport.Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        AFDExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport,profile);
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    System.out.println("requestDump: "+__httpTransport.requestDump);

                }
                if (__httpTransport.responseDump != null) {
                    System.out.println("responseDump: "+__httpTransport.responseDump);
                }
            }
        }
        Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }


    protected Exception convertToException(org.ksoap2.SoapFault fault,AFDExtendedSoapSerializationEnvelope envelope)
    {
        org.ksoap2.SoapFault newException = fault;
                return newException;
    }
}


