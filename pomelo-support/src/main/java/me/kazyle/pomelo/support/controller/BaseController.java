package me.kazyle.pomelo.support.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>pomelo</p>
 * <p>
 * <b>BaseController</b> is Controller基类 提供基础方法
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/26 14:20
 */
public abstract class BaseController {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private String viewPrefix;

    protected BaseController() {
        setViewPrefix(defaultViewPrefix());
    }

    /**
     * 获取视图名称，即：prefixViewName + "/" + suffixName
     *
     * @param suffixName
     * @return
     */
    protected String viewName(String suffixName) {
        if (!suffixName.startsWith("/")) {
            suffixName = "/" + suffixName;
        }
        return getViewPrefix() + suffixName;
    }

    /**
     * 重定向URL
     *
     * @param backURL
     * @return
     */
    protected String redirectToUrl(String backURL) {
        if (StringUtils.isEmpty(backURL)) {
            backURL = getViewPrefix();
        }
        if (!backURL.startsWith("/") && !backURL.startsWith("http") && !backURL.startsWith("https") ) {
            backURL = "/" + backURL;
        }
        return "redirect:" + backURL;
    }

    /**
     * 当前模块 视图的前缀
     * 默认
     * 1、获取当前类头上的@RequestMapping中的value作为前缀
     * 2、如果没有就使用当前模型的简单类名
     * @param viewPrefix
     */
    public void setViewPrefix(String viewPrefix) {
        if (viewPrefix.startsWith("/")) {
            viewPrefix = viewPrefix.substring(1);
        }
        this.viewPrefix = viewPrefix;
    }

    protected String defaultViewPrefix() {
        Class<?> clazz = getClass();
        String currentViewPrefix = "";
        RequestMapping requestMapping = AnnotationUtils.findAnnotation(getClass(), RequestMapping.class);
        if (null != requestMapping && requestMapping.value().length > 0) {
            currentViewPrefix = requestMapping.value()[0];
        }
        if (StringUtils.isEmpty(currentViewPrefix)) {
            currentViewPrefix = clazz.getSimpleName();
        }
        return currentViewPrefix;
    }

    protected String getViewPrefix() {
        return viewPrefix;
    }
}
