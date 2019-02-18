package cn.huaCloud.service;

import cn.huaCloud.domain.Rota;

import java.util.List;

/**
 * Created by LuoYJ on 2019/2/14.
 */
public interface RotaService {

    List<Rota> selectByRemarks(String remarks);

    Rota selectByPrimaryKey(String id);
}
