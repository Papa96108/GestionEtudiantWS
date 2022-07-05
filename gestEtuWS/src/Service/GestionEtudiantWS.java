package Service;

import javax.jws.*;

import metier.Etudiant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@WebService(serviceName="GestionEtudiantWS")

public class GestionEtudiantWS {
	

	@WebMethod(operationName="AjouterEtudiants")
	public void add(@WebParam(name="nom")String nom, @WebParam(name="prenom")String prenom){
		Etudiant etu = new Etudiant(nom, prenom);
		//load the driver
		  try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		  } catch (ClassNotFoundException e) {
		   e.printStackTrace();
		  }
		  try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiants", "root", "");
		    Statement st = con.createStatement();) {
			  System.out.println(etu.getPrenom()+" "+ etu.getNom());
		   //String query = "INSERT INTO etudiant(nom, prenom) values('GNINGUE', 'Papa Cheikh')";
		   String query = "INSERT INTO etudiant(nom, prenom) values('"+etu.getNom()+"','"+etu.getPrenom()+"')";
		   int count = st.executeUpdate(query);
		   if (count == 0) {
		    System.out.println("Problème d'Ajout Etudiant !");
		   } else {
		    System.out.println("Ajout Etudiant avec succés !");
		   }
		  } catch (SQLException se) {
		   se.printStackTrace();
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
	}
	
	@WebMethod(operationName="SupprimerEtudiants")
	public void detete(@WebParam(name="id")int id){
		// load the driver
		  try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		  } catch (ClassNotFoundException e) {
		   e.printStackTrace();
		  }
		  try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "toor");
		    Statement st = con.createStatement();) {
		   String query = "DELETE FROM etudiant WHERE id=id";
		   int count = st.executeUpdate(query);
		   if (count != 0) {
		    System.out.println("Suppression Etudiant avec succés !");
		   } else {
		    System.out.println("Problème de  suppression Etudiant !");
		   }
		  } catch (SQLException se) {
		   se.printStackTrace();
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
	}
	
	@WebMethod(operationName="ModifierEtudiants")
	public void update(@WebParam(name="id")Long id, @WebParam(name="nom") String nom, @WebParam(name="prenom") String prenom){
		Etudiant et = new Etudiant(id, nom, prenom);
				
		// load the driver
		try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			  } catch (ClassNotFoundException e) {
			   e.printStackTrace();
			  }
			  try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "toor");
			    Statement st = con.createStatement();) {
			   String query = "UPDATE etudiant SET nom='"+et.getNom()+"', prenom='"+et.getPrenom()+"' where id='"+et.getId()+"'";
			   int count = st.executeUpdate(query);
			   if (count != 0) {
			    System.out.println("Mise à jour Etudiant avec succés !");
			   } else {
			    System.out.println("Problème de Mise à jour Etudiant !");
			   }
			  } catch (SQLException se) {
			   se.printStackTrace();
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
	}
	
	@WebMethod(operationName = "ListerEtudiants")
	public void lister() {
		try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			  } catch (ClassNotFoundException e) {
			   e.printStackTrace();
			  }
			  try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "toor");
			    Statement st = con.createStatement();) {
			   String query = "SELECT id,nom,prenom FROM etudiant";
			   ResultSet rs = st.executeQuery(query);
			   while (rs.next()) {
			    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			   }
			  } catch (SQLException se) {
			   se.printStackTrace();
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
	}
}

