package com.mark.signing.controller;

import com.mark.signing.service.SigningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * describe:
 *
 * @author Mark
 * @date 2019/03/26
 * @QQ 85104982
 */
@RestController
public class SigningController {
    @Autowired
    private SigningService signingService;

    @RequestMapping("/signing")
    public Map<String,String> signing(@RequestParam String username){
        return signingService.signing(username);
    }

    @RequestMapping("/getSigningDetailsList")
    public List<Integer> getSigningDetailsList(@RequestParam String username){
        return signingService.getSigningDetailsList(username);
    }
}
