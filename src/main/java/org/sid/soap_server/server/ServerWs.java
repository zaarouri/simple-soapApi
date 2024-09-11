package org.sid.soap_server.server;

import jakarta.xml.ws.Endpoint;
import org.eclipse.persistence.sessions.server.Server;
import org.sid.soap_server.webservice.ProductWebService;

public class ServerWs {
    public static void main(String[] args) {
        String url = "http://localhost:8078/soap_server";
        Endpoint.publish(url, new ProductWebService());
        System.out.println(url + " is ready");
    }
}
