package guru.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repository.IAuthorRepository;
import guru.springframework.spring5webapp.repository.IBookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private IBookRepository bookRepository;
	private IAuthorRepository authorRepository;
	
	public DevBootstrap(IBookRepository bookRepository, IAuthorRepository authorRepository) {
		super();
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

	private void initData() {
		Author satyajitRay = new Author("Satyajit", "Ray");
		Book feluda = new Book("Feluda", "ibn112344", "Ananda");
		satyajitRay.getBooks().add(feluda);
		feluda.getAuthors().add(satyajitRay);
		
		bookRepository.save(feluda);
		authorRepository.save(satyajitRay);
		
		Author samoreshMojumdar = new Author("Samoresh", "Majumdar");
		Book arjun = new Book("Arjun", "ibn2211244", "Ananda");
		samoreshMojumdar.getBooks().add(arjun);
		arjun.getAuthors().add(samoreshMojumdar);
		authorRepository.save(samoreshMojumdar);
		bookRepository.save(arjun);
	}
}
