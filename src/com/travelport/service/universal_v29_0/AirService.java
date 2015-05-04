package com.travelport.service.universal_v29_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-19T15:08:10.325-06:00
 * Generated source version: 2.7.12
 * 
 */
@WebServiceClient(name = "AirService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/universal_v29_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v29_0") 
public class AirService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v29_0", "AirService");
    public final static QName AirCreateReservationPort = new QName("http://www.travelport.com/service/universal_v29_0", "AirCreateReservationPort");
    public final static QName AirMerchandisingFulfillmentPort = new QName("http://www.travelport.com/service/universal_v29_0", "AirMerchandisingFulfillmentPort");
    public final static QName AirCancelPort = new QName("http://www.travelport.com/service/universal_v29_0", "AirCancelPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/universal_v29_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AirService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/Wsdl/universal_v29_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AirService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AirService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AirService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AirService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AirService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AirService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AirCreateReservationPortType
     */
    @WebEndpoint(name = "AirCreateReservationPort")
    public AirCreateReservationPortType getAirCreateReservationPort() {
        return super.getPort(AirCreateReservationPort, AirCreateReservationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirCreateReservationPortType
     */
    @WebEndpoint(name = "AirCreateReservationPort")
    public AirCreateReservationPortType getAirCreateReservationPort(WebServiceFeature... features) {
        return super.getPort(AirCreateReservationPort, AirCreateReservationPortType.class, features);
    }
    /**
     *
     * @return
     *     returns AirMerchandisingFulfillmentPortType
     */
    @WebEndpoint(name = "AirMerchandisingFulfillmentPort")
    public AirMerchandisingFulfillmentPortType getAirMerchandisingFulfillmentPort() {
        return super.getPort(AirMerchandisingFulfillmentPort, AirMerchandisingFulfillmentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirMerchandisingFulfillmentPortType
     */
    @WebEndpoint(name = "AirMerchandisingFulfillmentPort")
    public AirMerchandisingFulfillmentPortType getAirMerchandisingFulfillmentPort(WebServiceFeature... features) {
        return super.getPort(AirMerchandisingFulfillmentPort, AirMerchandisingFulfillmentPortType.class, features);
    }
    /**
     *
     * @return
     *     returns AirCancelPortType
     */
    @WebEndpoint(name = "AirCancelPort")
    public AirCancelPortType getAirCancelPort() {
        return super.getPort(AirCancelPort, AirCancelPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirCancelPortType
     */
    @WebEndpoint(name = "AirCancelPort")
    public AirCancelPortType getAirCancelPort(WebServiceFeature... features) {
        return super.getPort(AirCancelPort, AirCancelPortType.class, features);
    }

}