package nguyenthangJavaWeb.DAO;

import java.util.List;

import nguyenthangJavaWeb.Model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByCode(String code);
}
