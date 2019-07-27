package pers.fancy.chat.users;

import pers.fancy.chat.bootstrap.channel.http.FromServerService;


/**
 * @author 李醴茝
 */

public enum  FromServerServiceImpl implements FromServerService {

    /**
     *
     */
    TYPE1(1,"【系统通知】您的账号存在异常，请注意安全保密信息。"),
    TYPE2(2,"【系统通知】恭喜您连续登录超过5天，奖励5积分。");

    private Integer code;
    private String message;

    FromServerServiceImpl(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String findByCode(Object code) {
        Integer codes = (Integer)code;
        for (FromServerServiceImpl item: FromServerServiceImpl.values()) {
            if (item.code == codes){
                return item.message;
            }
        }
        return null;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
