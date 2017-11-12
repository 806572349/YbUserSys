package om.dubbo.api.user;

import com.yb.base.component.BaseService;
import com.yb.user.model.YbUser;
import com.yb.user.model.YbUserInfo;

public interface UserLoginServiceApi extends BaseService{

	
	public ServiceResult<YbUser> save(YbUser user);

	ServiceResult<YbUser> findbyPhone(String phone);

	ServiceResult<YbUserInfo> findUserInfo(Integer id);

	ServiceResult<YbUser> CreateYbUser(String phone, String deviceCode);
}
