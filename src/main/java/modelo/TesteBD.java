package modelo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TesteBD {
	
	protected SessionFactory sessionFactory;

	protected void setup() {

		// configures settings from hibernate.cfg.xml
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			System.out.println("Erro no setup: " + ex.getMessage() + "\n");
			StandardServiceRegistryBuilder.destroy(registry);
		}

	}

	protected void exit() {
		sessionFactory.close();
	}

	
	protected void create(Deputado deputado) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(deputado);
		
		session.getTransaction().commit();
		session.close();
		
	}

	public static void main(String args[]) {

		
		TesteBD teste = new TesteBD();
		teste.setup();
		
		/*
		Deputado d = new Deputado();
		
		d.setUri("sola.com");		
		d.setNome("Sola");
		
		Date date1 = Date.valueOf(LocalDate.of(1960, Month.FEBRUARY, 22));
		Date date2 = Date.valueOf(LocalDate.of(1964, Month.FEBRUARY, 22));
		
		Legislatura li = new Legislatura("uri.com", date1, date2, 1959);
		d.setIdLegislaturaInicial(li);
		d.setIdLegislaturaFinal(null);
		
	    d.setNomeCivil("Solae");
	    d.setCpf("123.214.221-23");
	    d.setSiglaSexo("M");
	    
	    Date date = Date.valueOf(LocalDate.of(1967, Month.FEBRUARY, 22));
	    d.setDataNascimento(date);
	    
	    d.setDataFalecimento(null);
	    d.setUfNascimento("GO");
	    d.setMunicipioNascimento("Texas");
		
		teste.create(d);
		*/
		
		teste.exit();

	}

}
