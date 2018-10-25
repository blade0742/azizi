package com.example.dao;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
	@Query("Select p from Produit p where p.designation Like :x")
	public Page<Produit> produitParMC(@Param("x")String mc,Pageable p);
	public List<Produit> findByDesignation(String des);
	public List<Produit> findByDesignation(String des,Pageable p);

	

}
