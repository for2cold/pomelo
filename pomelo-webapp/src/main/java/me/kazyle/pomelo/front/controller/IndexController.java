package me.kazyle.pomelo.front.controller;/**
 * Created by Kazyle on 2016/11/3.
 */

import me.kazyle.pomelo.api.MemberApi;
import me.kazyle.pomelo.bo.MemberBo;
import me.kazyle.pomelo.support.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * <p>pomelo</p>
 * <p>
 * <b>IndexController</b> is
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/11/3.
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {

    @Resource
    private MemberApi memberApi;

    @RequestMapping("/index")
    public String index(Model model) {
        MemberBo bo = memberApi.getOne("122");
        model.addAttribute("bo", bo);
        return viewName("index");
    }
}
