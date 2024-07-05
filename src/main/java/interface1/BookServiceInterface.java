package interface1;

import java.util.List;

import Model.Book;
import Model.DbDetails;

public interface BookServiceInterface {
	public String createbook(Book obj,DbDetails d1);
	public String updateBook(Book obj);
	public String deleteBook(int id,DbDetails d1);
	public Book getbyid(int id);
	public List<Book> getall();


}
