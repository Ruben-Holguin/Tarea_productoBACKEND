package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CategoriaDao;
import com.example.entity.Categoria;
import com.example.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	@Autowired
	private CategoriaDao dao;
	
	@Override
	public Categoria create(Categoria ca) {
		// TODO Auto-generated method stub
		return dao.create(ca);
	}

	@Override
	public Categoria update(Categoria ca) {
		// TODO Auto-generated method stub
		return dao.update(ca);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Categoria> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
