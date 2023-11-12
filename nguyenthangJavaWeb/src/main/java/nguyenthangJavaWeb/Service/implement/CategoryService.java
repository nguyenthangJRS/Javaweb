package nguyenthangJavaWeb.Service.implement;

import java.util.List;

import javax.inject.Inject;

import nguyenthangJavaWeb.DAO.ICategoryDAO;
import nguyenthangJavaWeb.Model.CategoryModel;
import nguyenthangJavaWeb.Service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}