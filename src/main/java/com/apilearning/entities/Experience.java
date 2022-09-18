package com.apilearning.entities;

public class Experience {
    private int expId;
    private String expName;

    public Experience(int expId, String expName) {
        this.expId = expId;
        this.expName = expName;
    }

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }
}
