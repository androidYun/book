package com.ziming.book.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.ziming.book.entity.Master;
import com.ziming.book.mapper.MasterMapper;
import com.ziming.book.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterServiceImpl implements MasterService {

    @Autowired
    MasterMapper masterMapper;

    @Override
    public Master selectMasterById(String masterNumber) {
        return masterMapper.getByColumn("master_number", masterNumber);
    }

    @Override
    public List<Master> selectMasterList() {
        return masterMapper.list(new Query());
    }

    @Override
    public int insertMaster(Master master) {
        return masterMapper.save(master);
    }

    @Override
    public int deleteMaster(String masterNumber) {
        return masterMapper.deleteByQuery(new Query().addParam("masterNumber",masterNumber));
    }

    @Override
    public int updateMaster(Master master) {
        return masterMapper.update(master);
    }
}
