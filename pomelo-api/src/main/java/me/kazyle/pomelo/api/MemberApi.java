package me.kazyle.pomelo.api;

import me.kazyle.pomelo.bo.MemberBo;

/**
 * <p>pomelo</p>
 * <p>
 * <b>MemberApi</b> is 会员接口
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/26 14:36
 */
public interface MemberApi {

    /**
     * 根据会员号 获取会员信息
     * @param memberNo 会员号
     * @return 会员信息
     */
    MemberBo getOne(String memberNo);
}
