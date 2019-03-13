package fr.univbrest.dosi.repository;


import fr.univbrest.dosi.bean.Etudiant;

import org.springframework.data.repository.CrudRepository;


public interface EtudiantRepository  extends CrudRepository <Etudiant, String> {
	
	

}
