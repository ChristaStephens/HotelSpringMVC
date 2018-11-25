package Travel.Hotel.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.boot.model.relational.Namespace.Name;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Travel.Hotel.Entity.Hotel;

@Repository
@Transactional 
public class HotelDao {

	@PersistenceContext
	protected EntityManager em;
	
	public List<Hotel> findAll() {
		return em.createQuery(" FROM Hotel", Hotel.class).getResultList();
	}

	
}
