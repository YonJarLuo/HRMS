package cn.huaCloud.dao;

import cn.huaCloud.domain.Rota;

import java.util.List;

public interface RotaMapper {
    int deleteByPrimaryKey(String id);

    int insert(Rota record);

    int insertSelective(Rota record);

    Rota selectByPrimaryKey(String id);

    List<Rota> selectByRemarks(String remarks);

    int updateByPrimaryKeySelective(Rota record);

    int updateByPrimaryKey(Rota record);
}