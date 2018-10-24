package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/24.
 */
public class Offer implements Serializable {
    private Integer of_id;
    private String of_view;
    private Integer of_user_id;
    private Integer of_state;
    private Integer of_de_id;

    public Offer() {
    }

    public Offer(Integer of_id, String of_view, Integer of_user_id, Integer of_state, Integer of_de_id) {
        this.of_id = of_id;
        this.of_view = of_view;
        this.of_user_id = of_user_id;
        this.of_state = of_state;
        this.of_de_id = of_de_id;
    }

    public Offer(String of_view, Integer of_user_id, Integer of_state, Integer of_de_id) {
        this.of_view = of_view;
        this.of_user_id = of_user_id;
        this.of_state = of_state;
        this.of_de_id = of_de_id;
    }

    public Integer getOf_id() {
        return of_id;
    }

    public void setOf_id(Integer of_id) {
        this.of_id = of_id;
    }

    public String getOf_view() {
        return of_view;
    }

    public void setOf_view(String of_view) {
        this.of_view = of_view;
    }

    public Integer getOf_user_id() {
        return of_user_id;
    }

    public void setOf_user_id(Integer of_user_id) {
        this.of_user_id = of_user_id;
    }

    public Integer getOf_state() {
        return of_state;
    }

    public void setOf_state(Integer of_state) {
        this.of_state = of_state;
    }

    public Integer getOf_de_id() {
        return of_de_id;
    }

    public void setOf_de_id(Integer of_de_id) {
        this.of_de_id = of_de_id;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "of_id=" + of_id +
                ", of_view='" + of_view + '\'' +
                ", of_user_id=" + of_user_id +
                ", of_state=" + of_state +
                ", of_de_id=" + of_de_id +
                '}';
    }
}
