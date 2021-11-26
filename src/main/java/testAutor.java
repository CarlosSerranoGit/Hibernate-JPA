import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Autor;
import model.Libro;

public class testAutor {

	private static EntityManager em;
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emf=Persistence.createEntityManagerFactory("aplicacionMariaDB");
		em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		/*Autor a1=new Autor("Carlos",LocalDate.parse("1980-06-01"));
		Libro l1=new Libro("El Quijote");
		l1.setAutor(a1);
		Set<Libro> ls=a1.getLibros();
		ls.add(l1);
		em.persist(a1);*/
		
		/*Autor ax=em.find(Autor.class, 1L);
		System.out.println(ax);
		Set<Libro> libros=ax.getLibros();
		for(Libro l:libros) {
			System.out.println(l);
		}*/
		Libro lx=em.find(Libro.class, 1L);
		System.out.println(lx);
		Autor aa=lx.getAutor();
		System.out.println(aa);
			
		em.getTransaction().commit();

	}

}
