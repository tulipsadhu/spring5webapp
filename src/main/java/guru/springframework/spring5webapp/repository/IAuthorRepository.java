package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Author;

public interface IAuthorRepository extends CrudRepository<Author, Long>{

}
