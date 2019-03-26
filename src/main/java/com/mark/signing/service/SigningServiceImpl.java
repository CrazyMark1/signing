package com.mark.signing.service;

import com.mark.signing.dao.SigningEntityDao;
import com.mark.signing.entity.SigningEntity;
import com.mark.signing.manage.SigningManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * describe:
 *
 * @author Mark
 * @date 2019/03/26
 * @QQ 85104982
 */
@Service
public class SigningServiceImpl implements SigningService{
    @Autowired
    private SigningManage signingManage;
    @Autowired
    private SigningEntityDao signingEntityDao;

    @Override
    public Map<String, String> signing(String username) {
        SigningEntity signingEntity=signingEntityDao.findFirstByUsername(username);
        if (signingEntity==null){
            signingEntity=new SigningEntity();
            signingEntity.setUsername(username);
            signingEntity.setSigningDetails(0);
        }
        int signDetails=signingEntity.getSigningDetails();
        signingEntity.setSigningDetails(signingManage.signing(signDetails));
        signingEntityDao.save(signingEntity);
        Map<String,String> result=new HashMap<>();
        result.put("message","签到成功");
        return result;
    }

    @Override
    public List<Integer> getSigningDetailsList(String username) {
        SigningEntity signingEntity=signingEntityDao.findFirstByUsername(username);
        if (signingEntity==null){
            return new ArrayList<>();
        }
        return signingManage.getSigningDetailsList(signingEntity.getSigningDetails());
    }
}
