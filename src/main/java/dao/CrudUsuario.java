package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuarioable;
import model.TblUsuariocl2;

public class CrudUsuario implements IUsuarioable {

	@Override
	public TblUsuariocl2 AccederUsuario(TblUsuariocl2 tbluser) {
		
		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Bryan_Vizcardo_Evangelista");
		EntityManager entitymanag=conex.createEntityManager();
		
		entitymanag.getTransaction().begin();
		
		TblUsuariocl2 tbluser1 = entitymanag.createQuery("select u from TblUsuariocl2 u",TblUsuariocl2.class).getSingleResult();
		
		entitymanag.getTransaction().commit();
		
		entitymanag.close();
		
		return tbluser1;

	}

}
