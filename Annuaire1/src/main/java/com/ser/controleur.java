package com.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/controleur")
public class controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Facade f;
    
    public controleur() {
        //super();
        f=new Facade();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=0;
		PrintWriter out=response.getWriter();
		String m=request.getParameter("id");
		if(m!=null) {
			id=Integer.parseInt(m);
		}
		
		switch(id) {
			case 1:
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			f.ajoutPersonne(nom, prenom);
			response.setContentType("text/html");
			out.println("on ajouter une personne de nom: "+nom+" et de prenom: "+prenom);
			break;
			case 2:
				String rue=request.getParameter("rue");
				String ville=request.getParameter("ville");
				f.ajoutAdresse(rue, ville);
				response.setContentType("text/html");
				
				out.println("on ajouter une adresse de rue: "+rue+" et de ville: "+ville);
				break;
			case 3:
				int i=0;
				for(Personne p:f.getColP()) {
					out.println("nom: "+p.getNom()+", prenom: "+p.getPrenom()+" , id_personne: "+p.getIdP());
					out.println("les adresses associés à cette personne sont:");
					for(Adresse a:p.getColAP()) {
						out.println(" rue: "+a.getRue()+" , ville: "+a.getVille()+" , id: "+a.getIdA());
					}
					out.println("****************************************************");
					i++;
				}
				out.println("Les adresses disponibiles : ");
				for(Adresse a:f.getColA()) {
					out.println(" rue: "+a.getRue()+" , ville: "+a.getVille()+" , id: "+a.getIdA());
					out.println("------------------------------------------------");
					i++;
				}
				if(i==0) {
					out.println("veuillez ajouter des personnes et des adresses!!!!");
				}
				break;
			case 4:
				int idP=Integer.parseInt(request.getParameter("idP"));
				int idA=Integer.parseInt(request.getParameter("idA"));
				f.associer(idP, idA);
				out.println("l'association est effectué");
				break;
			
				
			
		}
			
		
		
		
		
		
	}
	
	

}
