package com.training;

import java.util.List;

public interface CrudRespositry<T> {
	
	public int add(T obj);
	public List<T>findAll();
	public int remove(int id);
	public T findById(int id);
	public int update(int id, T obj);

}
