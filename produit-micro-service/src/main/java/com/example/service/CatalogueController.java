package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProduitRepository;
import com.example.dao.Produit;

@RestController
public class CatalogueController  {
	@Autowired
	private ProduitRepository produitRepository; 
	@RequestMapping("/save") 
	public Produit saveProduit(Produit p)
	{ produitRepository.save(p); return p; }
	@RequestMapping("/all") 
	public List<Produit> getProduits(){ return produitRepository.findAll(); } 
	@RequestMapping("/produits") 
	public Page<Produit> getProduits(int page){ 
		return produitRepository.findAll(new PageRequest(page, 5)); 
	
	}
	@RequestMapping("/produitsParMC") 
	public Page<Produit> getProduits(String mc,int page){
		return produitRepository.produitParMC("%"+mc+"%", new PageRequest(page, 5)); 
	}
	@RequestMapping("/get") public Optional<Produit> getProduit(Long ref){ 
		return produitRepository.findById(ref); 
	}
	@RequestMapping("/delete")
	public boolean delete(Long ref){ produitRepository.deleteById(ref); return true; 
	}
	@RequestMapping("/update") public Produit update(Produit p){
		produitRepository.saveAndFlush(p);
	return p; 
	} 

}
