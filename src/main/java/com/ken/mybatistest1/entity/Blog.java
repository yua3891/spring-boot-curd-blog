package com.ken.mybatistest1.entity;

public class Blog {
    private Integer id;
    private String title;
    private String content;
    private Integer time_add;
    private Integer time_show;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTime_add() {
        return time_add;
    }

    public void setTime_add(Integer time_add) {
        this.time_add = time_add;
    }

    public Integer getTime_show() {
        return time_show;
    }

    public void setTime_show(Integer time_show) {
        this.time_show = time_show;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time_add=" + time_add +
                ", time_show=" + time_show +
                '}';
    }
}
