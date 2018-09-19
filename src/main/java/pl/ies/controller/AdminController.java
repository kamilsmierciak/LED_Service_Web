package pl.ies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ies.dao.HardwareDao;
import pl.ies.entity.Hardware;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private HardwareDao hardwareDao;

    @ModelAttribute("types")
    public String[] types(){
        String[] typesTemp = {"LED","Home device"};
        return typesTemp;
    }

    @GetMapping("/addhardware")
    public String addHardware(Model model){
        model.addAttribute("hardware", new Hardware());
        return "admin/addHardware";
    }

    @PostMapping("/addhardware")
    public String addHardwarePost(@Valid Hardware hardware, BindingResult result){
        if(result.hasErrors()){
            return "admin/addHardware";
        }
        this.hardwareDao.save(hardware);
        return "forward:admin/list";
    }
}
