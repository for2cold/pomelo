package me.kazyle.pomelo.entity;

import me.kazyle.pomelo.entity.enums.CardStatus;

/**
 * <p>kimber</p>
 * <p>
 * <b>MemberCard</b> is MemberCard Master Entity 会员卡表
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/10/10 16:27
 */
public class MemberCard extends BaseEntity<String> {

    private Long id;

    private String memberCardNo;

    private String cardNo;

    private CardStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberCardNo() {
        return memberCardNo;
    }

    public void setMemberCardNo(String memberCardNo) {
        this.memberCardNo = memberCardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }
}
