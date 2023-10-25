package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import interfaces.IProductoable;
import model.TblProductocl2;

public class CrudProductocl2 implements IProductoable {

	@Override
	public void RegistrarProd(TblProductocl2 tblprod) {
		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Bryan_Vizcardo_Evangelista");
		EntityManager entitymanag = conex.createEntityManager();
		
		entitymanag.getTransaction().begin();
		
		entitymanag.persist(tblprod);
		
		entitymanag.getTransaction().commit();
		
		entitymanag.close();
		
	}

	@Override
	public List<TblProductocl2> ListadoProduc() {
		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Bryan_Vizcardo_Evangelista");
		EntityManager entitymanag=conex.createEntityManager();
		
		entitymanag.getTransaction().begin();
		List<TblProductocl2> listado = entitymanag.createQuery("select p from TblProductocl2 p",TblProductocl2.class).getResultList();
		
		entitymanag.getTransaction().commit();
		
		entitymanag.close();
       
         return listado;
	}

	@Override
	public TblProductocl2 BuscarProd(TblProductocl2 tblprod) {
		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_Bryan_Vizcardo_Evangelista");
		EntityManager entitymanag=conex.createEntityManager();
		
		entitymanag.getTransaction().begin();
		TblProductocl2 find = entitymanag.find(TblProductocl2.class,tblprod.getIdproductocl2());
		entitymanag.getTransaction().commit();
		entitymanag.close();
		
		return find;
	}

}
