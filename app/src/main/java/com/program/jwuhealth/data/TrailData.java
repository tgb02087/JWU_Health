package com.program.jwuhealth.data;

import com.program.jwuhealth.entity.Trail;

import java.util.ArrayList;


public class TrailData {
    private volatile static TrailData _instance = null;

    private ArrayList<Trail> trails;


    public static TrailData getInstance() {
        if (_instance == null) {
            synchronized (TrailData.class) {
                if (_instance == null) {
                    _instance = new TrailData();
                }
            }
        }

        return _instance;
    }

    private TrailData() {
        // 초기화 (데이터 생성)
        init();
    }

    /* 초기화 (데이터 생성) */
    private void init() {
        this.trails = new ArrayList<>();

        this.trails.add(new Trail("A001", "A 산책로", "충청북도 괴산군 괴산읍 문무로 85", "괴산군 괴산읍"));
        this.trails.add(new Trail("A002", "B 산책로", "괴산시외버스공용터미널 괴산군 괴산읍", "괴산군 괴산읍 시외버스터미널"));
        this.trails.add(new Trail("A003", "C 산책로", "충청북도 괴산군 괴산읍 서부리 335", "괴산명덕초등학교"));

    }

    /* 산책로 데이터 얻기 */
    public ArrayList<Trail> getTrails() {
        return this.trails;
    }
}
