package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SC_DS_XiangXian", schema = "dbo", catalog = "GS_TS_PlantDLMS")
public class ScDsXiangXianEntity {
    private int id;
    private Integer xiangId;
    private Integer cheId;
    private String xianShuHao;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "xiangId")
    public Integer getXiangId() {
        return xiangId;
    }

    public void setXiangId(Integer xiangId) {
        this.xiangId = xiangId;
    }

    @Basic
    @Column(name = "cheId")
    public Integer getCheId() {
        return cheId;
    }

    public void setCheId(Integer cheId) {
        this.cheId = cheId;
    }

    @Basic
    @Column(name = "xianShuHao")
    public String getXianShuHao() {
        return xianShuHao;
    }

    public void setXianShuHao(String xianShuHao) {
        this.xianShuHao = xianShuHao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScDsXiangXianEntity that = (ScDsXiangXianEntity) o;
        return id == that.id &&
                Objects.equals(xiangId, that.xiangId) &&
                Objects.equals(cheId, that.cheId) &&
                Objects.equals(xianShuHao, that.xianShuHao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, xiangId, cheId, xianShuHao);
    }
}
