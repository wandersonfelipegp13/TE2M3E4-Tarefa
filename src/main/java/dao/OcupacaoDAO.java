package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import modelo.Deputado;
import modelo.Ocupacao;

public class OcupacaoDAO {

	protected SessionFactory sessionFactory;

	public void setup() {

		// configures settings from hibernate.cfg.xml
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			System.out.println("Erro no setup: " + ex.getMessage() + "\n");
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public void exit() {
		sessionFactory.close();
	}

	public Ocupacao read(int idOcupacao) {

		Session session = sessionFactory.openSession();

		Ocupacao ocp = session.get(Ocupacao.class, idOcupacao);

		session.close();

		return ocp;
	}

	public void create(Ocupacao ocupacao) {

		// if (ocupacao != null && read(ocupacao.getId()) == null) {
		
		DeputadoDAO depDAO = new DeputadoDAO();
		depDAO.setup();
		ocupacao.setDeputado(depDAO.read(ocupacao.getDeputado().getId()));
		depDAO.exit();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// session.save(ocupacao.getDeputado());
		session.save(ocupacao);

		session.getTransaction().commit();
		session.close();
		// }

	}

	public static void main(String[] args) {

		OcupacaoDAO dao = new OcupacaoDAO();
		dao.setup();

		Deputado deputado = new Deputado();
		deputado.setId(2);
		
		dao.create(new Ocupacao(deputado, "sola", "sola", "sola", "so", "sola", "2019", "2020"));

		dao.exit();

	}

}
