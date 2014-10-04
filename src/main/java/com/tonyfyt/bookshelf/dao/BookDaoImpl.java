package com.tonyfyt.bookshelf.dao;

import com.tonyfyt.bookshelf.model.Book;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
 
public class BookDaoImpl implements BookDao {
	
 private SessionFactory sessionFactory;
 
    public BookDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Override
    @Transactional // auto inject into sessionfactory
    public List<Book> list() {
        @SuppressWarnings("unchecked")
        List<Book> listBook = (List<Book>) sessionFactory.getCurrentSession()
                .createCriteria(Book.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listBook;
    }
	 

}
