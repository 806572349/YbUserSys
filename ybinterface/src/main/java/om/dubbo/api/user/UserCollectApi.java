package om.dubbo.api.user;

import com.yb.base.component.BaseService;
import com.yb.user.model.YbUserCollect;

import java.util.List;

/**
 * Created by 80657 on 2017/11/8.
 */
public interface UserCollectApi extends BaseService {

    ServiceResult<List<YbUserCollect>> getCollectList(Integer id, Integer page, Integer pageSize, Integer type);

    ServiceResult<Integer> addCollects(YbUserCollect ybUserCollect);


    ServiceResult<Integer> deleteCollects(int uid, int objid);

    YbUserCollect createCollect(Integer uid, Integer objid, String objname, String objdesc, String objnicn, String objurl, String objproperty, Integer type);
}
