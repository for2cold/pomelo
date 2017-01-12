package me.kazyle.pomelo.api.impl;

import me.kazyle.pomelo.api.MemberApi;
import me.kazyle.pomelo.bo.MemberBo;
import me.kazyle.pomelo.repository.MemberRepository;
import me.kazyle.pomelo.support.id.IdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>pomelo</p>
 * <p>
 * <b>MemberApiImpl</b> is
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/26 15:37
 */
@Service("memberApiImpl")
public class MemberApiImpl implements MemberApi {

    @Resource
    private MemberRepository memberRepository;

    private IdWorker idWorker = new IdWorker();

    @Override
    public MemberBo getOne(String memberNo) {
        MemberBo bo = new MemberBo();
        bo.setMemberNo("1111");
        bo.setName("kazyle");
        bo.setContact("123");
        return bo;
    }
}
