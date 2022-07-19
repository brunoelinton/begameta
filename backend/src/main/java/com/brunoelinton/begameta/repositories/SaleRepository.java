package com.brunoelinton.begameta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoelinton.begameta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
