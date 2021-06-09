package com.eddySalvaBlog.aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eddySalvaBlog.aplicacion.repository.UserRepository;
import com.eddySalvaBlog.aplicacion.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}
}
