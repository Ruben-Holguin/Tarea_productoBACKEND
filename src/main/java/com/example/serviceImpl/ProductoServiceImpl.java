package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductoDao;
import com.example.entity.Producto;
import com.example.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao dao;
	
	@Override
	public Producto create(Producto po) {
		// TODO Auto-generated method stub
		return dao.create(po);
	}

	@Override
	public Producto update(Producto po) {
		// TODO Auto-generated method stub
		return dao.update(po);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Producto> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
