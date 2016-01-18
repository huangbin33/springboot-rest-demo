package hqb.rest.controller;

import hqb.rest.model.Book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@RequestMapping(path="/books", method = RequestMethod.GET)
	public List<Book> get(@RequestParam(required=false) String name){
		if(name == null){
			return getAllBook();
		}
		else{
			return getBookByName(name);
		}
	}

	private List<Book> getBookByName(String name) {
	  return getAllBook();
    }

	private List<Book> getAllBook() {
		List<Book> books = new ArrayList<Book>();
		
		Book aBook = new Book();
		aBook.setName("天龙八部");
		aBook.setAuthor("金庸");
		aBook.setPrice(50.9);
		books.add(aBook);
		
		return books;
    }
}
