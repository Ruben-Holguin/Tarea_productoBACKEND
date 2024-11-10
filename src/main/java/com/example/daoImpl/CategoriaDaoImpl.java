package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.CategoriaDao;
import com.example.entity.Categoria;
import com.example.repository.CategoriaRepositor;

@Component
public class CategoriaDaoImpl implements CategoriaDao{
	@Autowired
	private CategoriaRepositor repositor;
	
	@Override
	public Categoria create(Categoria ca) {
		// TODO Auto-generated method stub
		return repositor.save(ca);
	}

	@Override
	public Categoria update(Categoria ca) {
		// TODO Auto-generated method stub
		return repositor.save(ca);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repositor.deleteById(id);
	}

	@Override
	public Optional<Categoria> read(Long id) {
		// TODO Auto-generated method stub
		return repositor.findById(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return repositor.findAll();
	}

}
