import java.util.List;

import model.Autor;
import model.Libro;
import model.DAO.AutorDAO;

public class testAutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor a=AutorDAO.selectById(1L);
		Libro l2=new Libro("Otro libro");
		AutorDAO.addLibro(a, l2);
	}

}
