package nguyenthangJavaWeb.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import nguyenthangJavaWeb.Model.CategoryModel;

public class CategoryMapper implements nguyenthangJavaWeb.Mapper.RowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		try {
			CategoryModel category = new CategoryModel();
			category.setId(resultSet.getLong("id"));
			category.setCode(resultSet.getString("code"));
			category.setName(resultSet.getString("name"));
			return category;
		} catch (SQLException e) {
			return null;
		}
	}
}

