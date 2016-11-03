package me.kazyle.pomelo.repository;

import me.kazyle.pomelo.mapper.MemberMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * <p>pomelo</p>
 * <p>
 * <b>MemberRepository</b> is 会员数据操作
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/26 11:31
 */
@Repository
public class MemberRepository {

    @Resource
    private MemberMapper memberMapper;
}
