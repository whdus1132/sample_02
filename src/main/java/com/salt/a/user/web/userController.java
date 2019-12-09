package com.salt.a.user.web;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.salt.a.test.HomeController;
import com.salt.a.test.MemberService;
import com.salt.a.test.MemberVO;

@Controller
public class userController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
    private MemberService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "user/home.do", method = RequestMethod.GET)
    public String login(Locale locale, Model model) throws Exception{
 
        logger.info("home");
        
        List<MemberVO> memberList = service.selectMember();
        
        model.addAttribute("memberList", memberList);
 
        return "user/login";
    }
}
