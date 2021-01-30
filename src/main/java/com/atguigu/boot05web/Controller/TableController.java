package com.atguigu.boot05web.Controller;

import com.atguigu.boot05web.Bean.User22;
import com.atguigu.boot05web.service.User22Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author kylin
 * @description 跳转页面
 * @date 2021-01-29 20:41
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        List<User22> list = user22Service.list();
//        model.addAttribute("user22s",list);
        Page<User22> user22Page = new Page<User22>(pn, 2);
        Page<User22> page = user22Service.page(user22Page, null);
        model.addAttribute("user22s", page);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }


    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }

    @GetMapping("/user/delete/{id}")
    public String delete_table(@PathVariable("id") Long id,
                               @RequestParam(value = "pn", defaultValue = "1") Integer pn,
                               RedirectAttributes re) {
        user22Service.removeById(id);
        //重定向添加属性
        re.addAttribute("pn", pn);
        return "redirect:/dynamic_table";
    }

    @Autowired
    User22Service user22Service;

}
