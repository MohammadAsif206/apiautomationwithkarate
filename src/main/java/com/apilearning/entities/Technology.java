package com.apilearning.entities;

public class Technology {
    private int techId;
    private String techName;
    private int projecId;

    public Technology(int techId, String techName, int projecId) {
        this.techId = techId;
        this.techName = techName;
        this.projecId = projecId;
    }

    public int getTechId() {
        return techId;
    }

    public void setTechId(int techId) {
        this.techId = techId;
    }

    public String getTechName() {
        return techName;
    }
    public int getProjecId(){return projecId;}
    public void setProjecId(int projecId){this.projecId=projecId;}

    public void setTechName(String techName) {
        this.techName = techName;
    }
}
/**
 * {
 *   "experience": [
 *     "String"
 *   ],
 *   "jobDescription": "String",
 *   "jobId": 0,
 *   "jobTitle": "String",
 *   "project": [
 *     {
 *       "projectName": "string",
 *       "technology": [
 *         "String"
 *       ]
 *     }
 *   ]
 * }
 */
