package nguyenthangJavaWeb.Service.implement;


import nguyenthangJavaWeb.DAO.IUserDAO;
import nguyenthangJavaWeb.DAO.implement.UserDAO;
import nguyenthangJavaWeb.Model.UserModel;
import nguyenthangJavaWeb.Service.IUserService;

public class UserService implements IUserService {

	private IUserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}
	
}
