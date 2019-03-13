package fr.univbrest.dosi.controller;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.business.EtudiantBusiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {

	private EtudiantBusiness business;

	@Autowired
	public EtudiantController(EtudiantBusiness business) {
		this.business = business;
	}

	@RequestMapping(method = RequestMethod.POST)
	public Etudiant CreateEtudiant(@RequestBody Etudiant etud) {

		return business.CreateEtudiant(etud);
	}

	@RequestMapping(method = RequestMethod.GET)

	public List<Etudiant> GetAllEtudiants() {

		//return null;
		return business.GetAllEtudiants();

	}

	@RequestMapping(method = RequestMethod.GET , value="/{NO_ETUDIANT}" )
        public void deleteEtudiant (@PathVariable("NO_ETUDIANT") String CNE ) {
        	
        	//this.business.deleteEtudiant(CNE);
        }

}
