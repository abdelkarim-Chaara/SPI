package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.CgRefCode;
import fr.univbrest.dosi.repository.CgRefCodeRepository;

@Service

public class CgRefCodeBusinessJPA implements CgRefCodeBusiness {

	CgRefCodeRepository repo;
	@Override
	public List<CgRefCode> GetAllCgRefCodes() {
		// TODO Auto-generated method stub
		return (List<CgRefCode>) repo.findAll();
	}

}
