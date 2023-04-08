package com.yoruhana.entity;

import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Data
public class MemberVO {

    //멤버 정보
    private int mb_no;
    private String mb_country;
    private String mb_nick;
    private String mb_name;
    private String mb_id;
    private String mb_pw;
    private String mb_tel;
    private String mb_tel1;
    private String mb_tel2;
    private String mb_tel3;
    private int mb_stat;
    private Date mb_join_date;
    private String mb_file;
    private int mb_prof_stat;
    private String mb_prof_content;
    private String mb_bir;
    private String mb_bir1;
    private String mb_bir2;
    private String mb_bir3;
    private int mb_see;
    private String mb_ptn_name;
    private String mb_ptn_email;
    private String mb_ptn_nick;
    private Date mb_ptn_con_date;
    private String mb_sex;
    private int mb_agree1;
    private int mb_agree2;



}
