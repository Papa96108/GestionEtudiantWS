package service;

public class ClientWS {
	public static void main(String[] args) {
		GestionEtudiantWS stub = new GestionEtudiantWS_Service().getGestionEtudiantWSPort();
		stub.ajouterEtudiants("Papa Ibra", "ndiaye");
		stub.modifierEtudiants((long) 1, "Alassane", "SARR");
		stub.supprimerEtudiants(1);
	}

}
