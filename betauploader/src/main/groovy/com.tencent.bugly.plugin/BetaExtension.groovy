package com.tencent.bugly.plugin

/**
 * Beta extension params
 * @author wenjiewu
 */
public class BetaExtension {
    public String appId = null // AppID 【必选】
    public String appKey = null // AppKey 【必选】
    //  【option】
    // 【接口参数】
    public String title = null // 标题
    public String desc = null // 版本描述
    public int secret = 1 // 公开范围（1：所有人，2：密码，4管理员，5QQ群，6白名单）
    public String users = null // 如果公开范围是"QQ群"填QQ群号；如果公开范围是"白名单"填QQ号码，并使用;切分开，5000个以内。其他场景无需设置
    public String password = null // 密码(如果公开范围是"密码"需设置)
    public int download_limit = 1000 // 下载上限(大于0，默认1000)
    public String expId = null // 需替换安装包的版本id

    // 【插件配置】
    public String apkFile = null // 指定上传的apk文件
    public Boolean enable = true // 插件开关
    public Boolean autoUpload = false // 是否自动上传
    public Boolean debugOn = false // debug模式是否上传

    String getAppId() {
        return appId
    }

    void setAppId(String appId) {
        this.appId = appId
    }

    String getAppKey() {
        return appKey
    }

    void setAppKey(String appKey) {
        this.appKey = appKey
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    String getDesc() {
        return desc
    }

    void setDesc(String desc) {
        this.desc = desc
    }

    int getSecret() {
        return secret
    }

    void setSecret(int secret) {
        this.secret = secret
    }

    String getUsers() {
        return users
    }

    void setUsers(String users) {
        this.users = users
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    int getDownload_limit() {
        return download_limit
    }

    void setDownload_limit(int download_limit) {
        this.download_limit = download_limit
    }

    String getExpId() {
        return expId
    }

    void setExpId(String expId) {
        this.expId = expId
    }

    String getApkFile() {
        return apkFile
    }

    void setApkFile(String apkFile) {
        this.apkFile = apkFile
    }

    Boolean getEnable() {
        return enable
    }

    void setEnable(Boolean enable) {
        this.enable = enable
    }

    Boolean getAutoUpload() {
        return autoUpload
    }

    void setAutoUpload(Boolean autoUpload) {
        this.autoUpload = autoUpload
    }

    Boolean getDebugOn() {
        return debugOn
    }

    void setDebugOn(Boolean debugOn) {
        this.debugOn = debugOn
    }
}