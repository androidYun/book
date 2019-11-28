package com.ziming.book.service;

import com.ziming.book.entity.Master;

import java.util.List;

public interface MasterService {
     Master selectMasterById(String masterNumber);

    List< Master> selectMasterList();

    int insertMaster( Master  master);

    int deleteMaster(String masterNumber);

    int updateMaster( Master  master);


}
