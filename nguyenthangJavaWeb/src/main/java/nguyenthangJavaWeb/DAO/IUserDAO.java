package nguyenthangJavaWeb.DAO;

import nguyenthangJavaWeb.Model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
