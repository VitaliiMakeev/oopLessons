package org.example.HomeWork.lesson7.data;

import org.example.HomeWork.lesson7.dataServis.iLogo;

import java.util.ArrayList;
import java.util.List;

public class Logo implements iLogo {
    private List<String> logo;

    public Logo() {
        this.logo = new ArrayList<>();
    }

    @Override
    public void log() {
        for (String s : this.logo) {
            System.out.println(s);
        }
    }

    @Override
    public void saveLog(String str) {
        this.logo.add(str);
    }
}
