package alehad.ws.soap;

import net.webservicex.*;

public class IPServiceSoapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Please enter IP address");
			return;
		}
		
		String ipAddress = args[0];
		
		GeoIPService ipService = new GeoIPService();
		
		GeoIPServiceSoap soapPort = ipService.getGeoIPServiceSoap();
		
		GeoIP geoIP = soapPort.getGeoIP(ipAddress);

		System.out.println(geoIP.getCountryName());
	}

}
