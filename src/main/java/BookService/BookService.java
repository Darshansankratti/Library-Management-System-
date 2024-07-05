package BookService;

import java.util.ArrayList;
import java.util.List;

import Exception.InvalidBookId;
import Model.Book;
import Model.DbDetails;
import daoLayer.DuoLayer;
import interface1.BookServiceInterface;

public class BookService implements BookServiceInterface {
	@Override
	public String createbook(Book obj,DbDetails d1) {
	
		DuoLayer a1= new DuoLayer();
		return a1.insert(obj,d1);	
	}
	@Override
	public String updateBook(Book obj) {
		try {
			if(obj.getBookid()<1) {
				throw new InvalidBookId("enter valid book id");
			}
		}catch(InvalidBookId e) {
			System.out.println(e);
		}
		
		DuoLayer d1= new DuoLayer();
		return d1.update(obj);
	}
	@Override
	public String deleteBook(int id,DbDetails db) {
		try {
			if(id<1) {
				throw new InvalidBookId("enter valid book id");
			}
		}catch(InvalidBookId e) {
			System.out.println(e);
		}
		DuoLayer d1= new DuoLayer();
		return d1.delete(id,db);
	}
	@Override
	public Book getbyid(int id) {
		try {
			if(id<1) {
				throw new InvalidBookId("enter valid book id");
			}
		}catch(InvalidBookId e) {
			System.out.println(e);
		}
		DuoLayer d1= new DuoLayer();
		return d1.getbyid1(id);
	}
	@Override
	public List<Book> getall(){
		DuoLayer d1= new DuoLayer();
		return d1.getallbook();
	}



}
