package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	public void setId(java.lang.Long id) {
		set("id", id);
	}

    /**
     * 主键ID
     */
	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 登录名
     */
	public void setUsername(java.lang.String username) {
		set("username", username);
	}

    /**
     * 登录名
     */
	public java.lang.String getUsername() {
		return getStr("username");
	}

    /**
     * 昵称
     */
	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}

    /**
     * 昵称
     */
	public java.lang.String getNickname() {
		return getStr("nickname");
	}

    /**
     * 实名
     */
	public void setRealname(java.lang.String realname) {
		set("realname", realname);
	}

    /**
     * 实名
     */
	public java.lang.String getRealname() {
		return getStr("realname");
	}

    /**
     * 身份
     */
	public void setIdentity(java.lang.String identity) {
		set("identity", identity);
	}

    /**
     * 身份
     */
	public java.lang.String getIdentity() {
		return getStr("identity");
	}

    /**
     * 密码
     */
	public void setPassword(java.lang.String password) {
		set("password", password);
	}

    /**
     * 密码
     */
	public java.lang.String getPassword() {
		return getStr("password");
	}

    /**
     * 盐
     */
	public void setSalt(java.lang.String salt) {
		set("salt", salt);
	}

    /**
     * 盐
     */
	public java.lang.String getSalt() {
		return getStr("salt");
	}

    /**
     * 匿名ID
     */
	public void setAnonym(java.lang.String anonym) {
		set("anonym", anonym);
	}

    /**
     * 匿名ID
     */
	public java.lang.String getAnonym() {
		return getStr("anonym");
	}

    /**
     * 邮件
     */
	public void setEmail(java.lang.String email) {
		set("email", email);
	}

    /**
     * 邮件
     */
	public java.lang.String getEmail() {
		return getStr("email");
	}

    /**
     * 邮箱状态（是否认证等）
     */
	public void setEmailStatus(java.lang.String emailStatus) {
		set("email_status", emailStatus);
	}

    /**
     * 邮箱状态（是否认证等）
     */
	public java.lang.String getEmailStatus() {
		return getStr("email_status");
	}

    /**
     * 手机电话
     */
	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}

    /**
     * 手机电话
     */
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

    /**
     * 手机状态（是否认证等）
     */
	public void setMobileStatus(java.lang.String mobileStatus) {
		set("mobile_status", mobileStatus);
	}

    /**
     * 手机状态（是否认证等）
     */
	public java.lang.String getMobileStatus() {
		return getStr("mobile_status");
	}

    /**
     * 性别
     */
	public void setGender(java.lang.String gender) {
		set("gender", gender);
	}

    /**
     * 性别
     */
	public java.lang.String getGender() {
		return getStr("gender");
	}

    /**
     * 签名
     */
	public void setSignature(java.lang.String signature) {
		set("signature", signature);
	}

    /**
     * 签名
     */
	public java.lang.String getSignature() {
		return getStr("signature");
	}

    /**
     * 生日
     */
	public void setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
	}

    /**
     * 生日
     */
	public java.util.Date getBirthday() {
		return get("birthday");
	}

    /**
     * 公司
     */
	public void setCompany(java.lang.String company) {
		set("company", company);
	}

    /**
     * 公司
     */
	public java.lang.String getCompany() {
		return getStr("company");
	}

    /**
     * 职位、职业
     */
	public void setOccupation(java.lang.String occupation) {
		set("occupation", occupation);
	}

    /**
     * 职位、职业
     */
	public java.lang.String getOccupation() {
		return getStr("occupation");
	}

    /**
     * 地址
     */
	public void setAddress(java.lang.String address) {
		set("address", address);
	}

    /**
     * 地址
     */
	public java.lang.String getAddress() {
		return getStr("address");
	}

    /**
     * 邮政编码
     */
	public void setZipcode(java.lang.String zipcode) {
		set("zipcode", zipcode);
	}

    /**
     * 邮政编码
     */
	public java.lang.String getZipcode() {
		return getStr("zipcode");
	}

    /**
     * 个人网址
     */
	public void setSite(java.lang.String site) {
		set("site", site);
	}

    /**
     * 个人网址
     */
	public java.lang.String getSite() {
		return getStr("site");
	}

    /**
     * 毕业学校
     */
	public void setGraduateschool(java.lang.String graduateschool) {
		set("graduateschool", graduateschool);
	}

    /**
     * 毕业学校
     */
	public java.lang.String getGraduateschool() {
		return getStr("graduateschool");
	}

    /**
     * 学历
     */
	public void setEducation(java.lang.String education) {
		set("education", education);
	}

    /**
     * 学历
     */
	public java.lang.String getEducation() {
		return getStr("education");
	}

    /**
     * 头像
     */
	public void setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
	}

    /**
     * 头像
     */
	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

    /**
     * 证件类型：身份证 护照 军官证等
     */
	public void setIdcardtype(java.lang.String idcardtype) {
		set("idcardtype", idcardtype);
	}

    /**
     * 证件类型：身份证 护照 军官证等
     */
	public java.lang.String getIdcardtype() {
		return getStr("idcardtype");
	}

    /**
     * 证件号码
     */
	public void setIdcard(java.lang.String idcard) {
		set("idcard", idcard);
	}

    /**
     * 证件号码
     */
	public java.lang.String getIdcard() {
		return getStr("idcard");
	}

    /**
     * 备注
     */
	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

    /**
     * 备注
     */
	public java.lang.String getRemark() {
		return getStr("remark");
	}

    /**
     * 状态
     */
	public void setStatus(java.lang.String status) {
		set("status", status);
	}

    /**
     * 状态
     */
	public java.lang.String getStatus() {
		return getStr("status");
	}

    /**
     * 创建日期
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建日期
     */
	public java.util.Date getCreated() {
		return get("created");
	}

    /**
     * 用户来源（可能来之oauth第三方）
     */
	public void setCreateSource(java.lang.String createSource) {
		set("create_source", createSource);
	}

    /**
     * 用户来源（可能来之oauth第三方）
     */
	public java.lang.String getCreateSource() {
		return getStr("create_source");
	}

    /**
     * 最后的登录时间
     */
	public void setLogged(java.util.Date logged) {
		set("logged", logged);
	}

    /**
     * 最后的登录时间
     */
	public java.util.Date getLogged() {
		return get("logged");
	}

    /**
     * 激活时间
     */
	public void setActivated(java.util.Date activated) {
		set("activated", activated);
	}

    /**
     * 激活时间
     */
	public java.util.Date getActivated() {
		return get("activated");
	}

}
