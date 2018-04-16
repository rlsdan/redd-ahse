package com.netrepublic.ahse.service;

import java.util.Collection;

public interface ServiceDao {

	public Object get(Long id);

	public Collection<?> getAll();

	public void save(Object object);

	public void remove(Object object);
}
