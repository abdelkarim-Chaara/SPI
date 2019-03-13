package fr.univbrest.dosi.repositories;

import fr.univbrest.dosi.bean.Etudiant;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EtudiantRepository  extends CrudRepository <Etudiant, String> {
	
	

}

