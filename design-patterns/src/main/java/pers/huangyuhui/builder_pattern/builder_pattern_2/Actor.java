package pers.huangyuhui.builder_pattern.builder_pattern_2;

/**
 * @project: design-patterns
 * @description: 游戏角色类, 充当复杂产品对象
 * @author: 黄宇辉
 * @date: 9/19/2019-1:30 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Actor {
    private String type; //角色类型
    private String sex; //性别
    private String face; //脸型
    private String costume; //服装

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", face='" + face + '\'' +
                ", costume='" + costume + '\'' +
                '}';
    }
}