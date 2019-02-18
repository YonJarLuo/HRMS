package cn.huaCloud.service.impl;

import cn.huaCloud.dao.RotaMapper;
import cn.huaCloud.domain.Rota;
import cn.huaCloud.service.RotaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LuoYJ on 2019/2/14.
 */
@Service
public class RotaServiceImpl implements RotaService {

    @Resource
    private RotaMapper rotaMapper;

    public List<Rota> selectByRemarks(String remarks) {
        return rotaMapper.selectByRemarks(remarks);
    }

    public Rota selectByPrimaryKey(String id) {
        return rotaMapper.selectByPrimaryKey(id);
    }
}
