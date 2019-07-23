package cn.kingzao.blog.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;


public class User implements Serializable {


    private static final long serialVersionUID = -2718594870419955038L;

    private Integer userId;              //主键
    private String userIp ;              //ip
    private String userName ;            //用户名
    private String userPassword ;        //用户密码
    private String userSalt;             //盐
    private String userEmail ;           //用户邮箱
    private String userProfilePhoto ;    //用户头像
    private Date userRegistrationTime ;  //用户注册时间
    private Date userBirthday ;          //用户生日
    private Integer userAge ;            //用户年龄
    private Integer userTelephoneNumber; //用户手机号
    private String userNickname ;        //用户昵称
    private Integer userFrozen;          //冻结
    private Integer userLock ;           //锁
    private Date userUpdateTime;         //修改时间
    private Date userLoginTime ;         //上一次登入时间

    public User (){

    }

    public User(String userName, String userPassword, String userEmail) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userSalt = userSalt;
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserProfilePhoto() {
        return userProfilePhoto;
    }

    public void setUserProfilePhoto(String userProfilePhoto) {
        this.userProfilePhoto = userProfilePhoto;
    }

    public Date getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(Date userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserTelephoneNumber() {
        return userTelephoneNumber;
    }

    public void setUserTelephoneNumber(Integer userTelephoneNumber) {
        this.userTelephoneNumber = userTelephoneNumber;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Integer getUserFrozen() {
        return userFrozen;
    }

    public void setUserFrozen(Integer userFrozen) {
        this.userFrozen = userFrozen;
    }

    public Integer getUserLock() {
        return userLock;
    }

    public void setUserLock(Integer userLock) {
        this.userLock = userLock;
    }

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public Date getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Date userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userId.equals(user.userId) &&
                Objects.equals(userIp, user.userIp) &&
                userName.equals(user.userName) &&
                userPassword.equals(user.userPassword) &&
                userSalt.equals(user.userSalt) &&
                userEmail.equals(user.userEmail) &&
                userProfilePhoto.equals(user.userProfilePhoto) &&
                userRegistrationTime.equals(user.userRegistrationTime) &&
                Objects.equals(userBirthday, user.userBirthday) &&
                Objects.equals(userAge, user.userAge) &&
                Objects.equals(userTelephoneNumber, user.userTelephoneNumber) &&
                Objects.equals(userNickname, user.userNickname) &&
                Objects.equals(userFrozen, user.userFrozen) &&
                Objects.equals(userLock, user.userLock) &&
                userUpdateTime.equals(user.userUpdateTime) &&
                userLoginTime.equals(user.userLoginTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userIp, userName, userPassword, userSalt, userEmail, userProfilePhoto, userRegistrationTime, userBirthday, userAge, userTelephoneNumber, userNickname, userFrozen, userLock, userUpdateTime, userLoginTime);
    }

    public User(Integer userId, String userIp, String userName, String userPassword, String userSalt, String userEmail, String userProfilePhoto, Integer userLevel, Integer userRights, Date userRegistrationTime, Date userBirthday, Integer userAge, Integer userTelephoneNumber, String userNickname, Integer userFrozen, Integer userLock, Date userUpdateTime, Date userLoginTime) {
        this.userId = userId;
        this.userIp = userIp;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userSalt = userSalt;
        this.userEmail = userEmail;
        this.userProfilePhoto = userProfilePhoto;
        this.userRegistrationTime = userRegistrationTime;
        this.userBirthday = userBirthday;
        this.userAge = userAge;
        this.userTelephoneNumber = userTelephoneNumber;
        this.userNickname = userNickname;
        this.userFrozen = userFrozen;
        this.userLock = userLock;
        this.userUpdateTime = userUpdateTime;
        this.userLoginTime = userLoginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userIp='" + userIp + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSalt='" + userSalt + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userProfilePhoto='" + userProfilePhoto + '\'' +
                ", userRegistrationTime=" + userRegistrationTime +
                ", userBirthday=" + userBirthday +
                ", userAge=" + userAge +
                ", userTelephoneNumber=" + userTelephoneNumber +
                ", userNickname='" + userNickname + '\'' +
                ", userFrozen=" + userFrozen +
                ", userLock=" + userLock +
                ", userUpdateTime=" + userUpdateTime +
                ", userLoginTime=" + userLoginTime +
                '}';
    }
}
