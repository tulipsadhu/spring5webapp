package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Book;

public interface IBookRepository extends CrudRepository<Book, Long>{

}