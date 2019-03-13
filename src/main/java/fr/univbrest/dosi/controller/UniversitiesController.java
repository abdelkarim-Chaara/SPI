package fr.univbrest.dosi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.business.PromotionBusiness;

@RestController
@RequestMapping("/universities")
public class UniversitiesController {
	
	@Autowired
    public UniversitiesController(PromotionBusiness business) {
        //this.business = business;
    }
	
	 @RequestMapping(method = RequestMethod.GET)
	    public List<Promotion> recupererPromotions(){
	     return null;  
		 // return business.recupererPromotions();
	    }

}
