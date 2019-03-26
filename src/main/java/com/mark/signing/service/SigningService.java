package com.mark.signing.service;

import java.util.List;
import java.util.Map;

/**
 * describe:
 *
 * @author Mark
 * @date 2019/03/26
 * @QQ 85104982
 */
public interface SigningService {
    /**
     * 签到
     * @param username
     * @return
     */
    Map<String,String> signing(String username);

    /**
     * 获取签到天数列表
     * @param username
     * @return
     */
    List<Integer> getSigningDetailsList(String username);
}
