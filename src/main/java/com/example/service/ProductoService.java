package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Producto;

public interface ProductoService {
	Producto create(Producto po);
	Producto update(Producto po);
	void delete(Long id);
	Optional<Producto> read(Long id);
	List<Producto> readAll();
}
