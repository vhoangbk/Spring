package hoang.paraline.home;

import hoang.paraline.dao.AdminAuthDao;
import hoang.paraline.entities.AdminAuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/home")
public class HomeController {

    @Autowired
    AdminAuthDao mAdminAuth;
    
    @RequestMapping(value="", method=RequestMethod.GET)
    public String index(){
        
        AdminAuth auth = mAdminAuth.getById(14);
        
        return "home/index";
    }
}
