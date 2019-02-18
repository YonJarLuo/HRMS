package cn.huaCloud.dao;

import cn.huaCloud.domain.Communication;

public interface CommunicationMapper {
    int deleteByPrimaryKey(String uId);

    int insert(Communication record);

    int insertSelective(Communication record);

    Communication selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(Communication record);

    int updateByPrimaryKey(Communication record);
}