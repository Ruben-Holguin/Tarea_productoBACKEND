package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.ProductoDao;
import com.example.entity.Producto;
import com.example.repository.ProductoRepository;

@Component
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public Producto create(Producto po) {
		// TODO Auto-generated method stub
		return repository.save(po);
	}

	@Override
	public Producto update(Producto po) {
		// TODO Auto-generated method stub
		return repository.save(po);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Producto> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
