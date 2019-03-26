package com.mark.signing.manage;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * describe:签到相关manage
 *
 * @author Mark
 * @date 2019/03/26
 * @QQ 85104982
 */
@Service
public class SigningManage {
    /**
     * 记录签到天数
     *
     * @param signingDetails
     * @return
     */
    public int signing(int signingDetails) {
        return signingDetails | 1 << getDay();
    }

    /**
     * 获取今天是该月的第几天
     *
     * @return
     */
    public int getDay() {
        return new Date().getDate();
    }

    /**
     * 得到签到天数列表
     *
     * @param signingDetails
     * @return
     */
    public List<Integer> getSigningDetailsList(int signingDetails) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 31; i++) {
            int n = signingDetails >> i & 1;
            if (n == 1) {
                list.add(i);
            }
        }
        return list;
    }

}
