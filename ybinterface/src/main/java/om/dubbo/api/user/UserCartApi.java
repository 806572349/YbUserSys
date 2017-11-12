package om.dubbo.api.user;

import com.yb.user.model.YbUserCart;

import java.util.List;

/**
 * Created by 80657 on 2017/11/9.
 */
public interface UserCartApi {
    List<YbUserCart> queryAll(Integer uid);

    void save(YbUserCart ybUserCart);
}
