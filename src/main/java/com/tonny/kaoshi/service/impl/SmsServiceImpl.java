package com.tonny.kaoshi.service.impl;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.tonny.kaoshi.entity.Login;
import com.tonny.kaoshi.mapper.LoginMapper;
import com.tonny.kaoshi.service.SmsService;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

@Service
public class SmsServiceImpl implements SmsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${tencent.appId}")
    int appId;

    @Value("${tencent.appKey}")
    String appKey;

    @Value("${tencent.templateId}")
    int  templateId;

    @Value("${tencent.smsSign}")
    String smsSign;
    @Autowired
    LoginMapper loginMapper;
    @Override
   public  void sendSms(String pho)
    {
        int key = 0;
        String[] phoneNumbers = {"1"};
        phoneNumbers[0] = pho;
        Random rand = new Random();
        key = rand.nextInt(10000);
        String s = String.valueOf(key);
        switch (s.length()){
            case 1:
                s="000"+s;
            case 2:
                s="00"+s;
            case 3:
                s="0"+s;
        }
        try {
            String[] params = {"5678"};
            params[0] = s;
            SmsSingleSender ssender = new SmsSingleSender(appId, appKey);
            SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers[0],
                    templateId, params, smsSign, "", "");
            Login l = new Login();
            l.setUname(pho);
            l.setScode(s);
            l.setIndate(new Date());
            loginMapper.insertLogin(l);
            logger.info("短信发送成功！");
        } catch (HTTPException e) {
            // HTTP 响应码错误
            e.printStackTrace();
            logger.info("短信失败！");
        } catch (JSONException e) {
            // JSON 解析错误
            e.printStackTrace();
            logger.info("短信失败！");
        } catch (IOException e) {
            // 网络 IO 错误
            e.printStackTrace();
            logger.info("短信失败！");
        }
    }
}
