package com.brunoelinton.begameta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoelinton.begameta.entities.Sale;
import com.brunoelinton.begameta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales(){
		return repository.findAll();
	}
}
