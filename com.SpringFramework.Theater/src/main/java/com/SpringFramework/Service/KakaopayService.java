package com.SpringFramework.Service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.SpringFramework.domain.KakaoPayReadyVO;
import com.SpringFramework.domain.KakaopayPurchaseVO;

import lombok.Setter;
import lombok.extern.java.Log;

@Service
@Log
public class KakaopayService {
 
    private static final String HOST = "https://kapi.kakao.com";
    
    private KakaoPayReadyVO kakaoPayReadyVO;
    
    public String kakaoPayReady(KakaopayPurchaseVO purhcaseVO) {
        RestTemplate restTemplate = new RestTemplate();
        //github test
        // 서버로 요청할 Header
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "KakaoAK " + "39fed8855b6fb76878862f2d42d39f24");
        headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");
        
        // 서버로 요청할 Body
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("cid", "TC0ONETIME");
        params.add("partner_order_id", "1001");
        params.add("partner_user_id", purhcaseVO.getUser_id());
        params.add("item_name", Integer.toString(purhcaseVO.getTime_id()));
        params.add("quantity", "1");
        params.add("total_amount", String.valueOf(purhcaseVO.getPrice()));
        params.add("tax_free_amount", "0");
        params.add("approval_url", "http://localhost:8060/kakaoPaySuccess");
        params.add("cancel_url", "http://localhost:8060/kakaoPayCancel");
        params.add("fail_url", "http://localhost:8060/kakaoPaySuccessFail");
 
         HttpEntity<MultiValueMap<String, String>> body = new HttpEntity<MultiValueMap<String, String>>(params, headers);
 
        try {
        	KakaoPayReadyVO kakaoPayReadyVO = restTemplate.postForObject(new URI(HOST + "/v1/payment/ready"), body, KakaoPayReadyVO.class);
            
            log.info("" + kakaoPayReadyVO);
            
            return kakaoPayReadyVO.getNext_redirect_pc_url();
 
        } catch (RestClientException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        
        return "/pay";
        
    }
    
}
