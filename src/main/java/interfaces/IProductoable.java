package interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProductoable {

	public void RegistrarProd(TblProductocl2 tblprod);
	public List<TblProductocl2> ListadoProduc();
	public TblProductocl2 BuscarProd(TblProductocl2 tblprod);
}
