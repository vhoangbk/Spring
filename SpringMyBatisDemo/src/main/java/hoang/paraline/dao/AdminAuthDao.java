package hoang.paraline.dao;

import org.apache.ibatis.annotations.Param;

import hoang.paraline.entities.AdminAuth;


public interface AdminAuthDao {

	public Integer getCountForDepartment();
	
	public AdminAuth getById(@Param("id") int id);

}
