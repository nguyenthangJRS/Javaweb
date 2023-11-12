package nguyenthangJavaWeb.Service;

import nguyenthangJavaWeb.Model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}