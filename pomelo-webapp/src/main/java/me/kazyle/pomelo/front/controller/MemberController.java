package me.kazyle.pomelo.front.controller;

import me.kazyle.pomelo.api.MemberApi;
import me.kazyle.pomelo.support.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * <p>pomelo</p>
 * <p>
 * <b>MemberController</b> is 会员控制器
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/26 14:18
 */
@Controller
@RequestMapping("/front/member")
public class MemberController extends BaseController {

//    @Resource
    private MemberApi memberApi;

    @RequestMapping("/index")
    public String index(Model model) {
        return viewName("index");
    }

    @RequestMapping(value = "showAddView", method = RequestMethod.GET)
    public String showAddView(Model model) {
        return viewName("showAddView");
    }
}
