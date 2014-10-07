package com.tonyfyt.bookshelf.dao;

import com.tonyfyt.bookshelf.model.*;

import java.util.List;

public interface BookDao {
	public List<Book> list();

	public Book get(int id);

	public void saveOrUpdate(Book book);

	public void delete(int id);
}
