package com.tonyfyt.bookshelf;

import com.tonyfyt.bookshelf.dao.BookDao;
import com.tonyfyt.bookshelf.model.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		List<Book> listBooks = bookDao.list();
		ModelAndView model = new ModelAndView("home");
		model.addObject("bookList", listBooks);
		return model;
	}
	
}
