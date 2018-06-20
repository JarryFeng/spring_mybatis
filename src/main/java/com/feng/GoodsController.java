package com.feng;

import com.feng.pojo.Good;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.awt.SystemColor.text;

/**
 * Created by jarry on 2017/10/31.
 */
@Controller
public class GoodsController {

    @RequestMapping("/query")
    public ModelAndView query() {

        List<Good> goodList = new ArrayList<Good>();
        Good good = new Good();
        good.setName("苹果");
        good.setNote("iphonex");
        good.setPrice(BigDecimal.valueOf(10000));
        good.setProductDate(new Date());
        goodList.add(good);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello", goodList);
        modelAndView.setViewName("goods");
        return modelAndView;
    }

    @RequestMapping("/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hehe", "呵呵");
        modelAndView.setViewName("goods");
        return modelAndView;
    }

    @RequestMapping(value = "/welcome")
    @ResponseBody
    public String welcome() {
        return "angular.callbacks._0({'name':123})";
    }
}
