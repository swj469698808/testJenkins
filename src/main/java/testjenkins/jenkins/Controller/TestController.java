package testjenkins.jenkins.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: sunwj
 * @CreateDate: 2019/9/27 11:10
 */
@RestController
public class TestController {


    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String Test(){
        return "我是第4444版的jenkins";
    }
}

