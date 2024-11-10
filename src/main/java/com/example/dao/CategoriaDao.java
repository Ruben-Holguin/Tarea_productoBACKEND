package com.example.dao;

import java.util.List;
import java.util.Optional;

import com.example.entity.Categoria;

public interface CategoriaDao {
	Categoria create(Categoria ca);
	Categoria update(Categoria ca);
	void delete(Long id);
	Optional<Categoria> read(Long id);
	List<Categoria> readAll();
}
