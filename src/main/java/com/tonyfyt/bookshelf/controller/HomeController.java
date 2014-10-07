package com.tonyfyt.bookshelf.controller;

import com.tonyfyt.bookshelf.dao.BookDao;
import com.tonyfyt.bookshelf.model.Book;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		List<Book> listBooks = bookDao.list();
		ModelAndView model = new ModelAndView("BookList");
		model.addObject("bookList", listBooks);
		return model;
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newBook() {
		ModelAndView model = new ModelAndView("BookForm");
		model.addObject("book", new Book());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		int bookId = Integer.parseInt(request.getParameter("id"));
		Book book = bookDao.get(bookId);
		ModelAndView model = new ModelAndView("BookForm");
		model.addObject("book", book);
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int bookId = Integer.parseInt(request.getParameter("id"));
		bookDao.delete(bookId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateBook(@ModelAttribute Book book) {
		bookDao.update(book);
		return new ModelAndView("redirect:/");
	}	
}
