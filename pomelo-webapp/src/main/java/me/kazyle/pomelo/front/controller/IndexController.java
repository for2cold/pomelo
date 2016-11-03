package me.kazyle.pomelo.front.controller;/**
 * Created by Kazyle on 2016/11/3.
 */

import me.kazyle.pomelo.support.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("index", "Demo");
        return viewName("index");
    }
}
