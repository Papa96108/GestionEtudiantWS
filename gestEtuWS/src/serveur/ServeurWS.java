package serveur;

import javax.xml.ws.Endpoint;
import Service.GestionEtudiantWS;

public class ServeurWS {
	public static void main(String[] args) {
		String url="http://localhost:8686/";
		Endpoint.publish(url, new GestionEtudiantWS());
		System.out.println(url);
	}
}
