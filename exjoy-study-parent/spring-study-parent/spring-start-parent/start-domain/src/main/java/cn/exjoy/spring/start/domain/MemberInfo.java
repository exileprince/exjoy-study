package cn.exjoy.spring.start.domain;

import java.util.Date;

public class MemberInfo {
    private long   memberId;

    private String memberLoginId;

    private String memberName;

    private String memberEncryptPwd;

    private Date   birthday;

    private String address;

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getMemberLoginId() {
        return memberLoginId;
    }

    public void setMemberLoginId(String memberLoginId) {
        this.memberLoginId = memberLoginId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEncryptPwd() {
        return memberEncryptPwd;
    }

    public void setMemberEncryptPwd(String memberEncryptPwd) {
        this.memberEncryptPwd = memberEncryptPwd;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
