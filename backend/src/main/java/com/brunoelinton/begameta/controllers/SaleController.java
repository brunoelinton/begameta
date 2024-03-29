package com.brunoelinton.begameta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brunoelinton.begameta.entities.Sale;
import com.brunoelinton.begameta.services.SaleService;
import com.brunoelinton.begameta.services.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@Autowired
	private SmsService smsService;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			 Pageable pageable){
		return service.findSales(minDate, maxDate, pageable);
	}
	
	@GetMapping("/{id}/notification")
	public ResponseEntity<Void> notifySms(@PathVariable Long id) {
		System.out.println("Teste de SMS");
		smsService.sendSms(id);
		return ResponseEntity.noContent().build();
	}
}
