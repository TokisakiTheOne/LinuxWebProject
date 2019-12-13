package com.yyh.handler;

import com.yyh.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YanYuHang
 * @create 2019-12-13-10:57
 */
@Controller
public class StudentHandler {

    @Autowired
    private StudentDao sd;

    @RequestMapping("/select")
    public String selectAll(Model model) {
        model.addAttribute("list", sd.selectAll());
        return "index";
    }

}
