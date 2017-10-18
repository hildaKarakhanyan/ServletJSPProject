package com.synergy.training.entities;

import com.synergy.training.entities.model.Currency;
import com.synergy.training.entities.model.Project;
import com.synergy.training.entities.model.Sector;
import com.synergy.training.entities.model.SubSector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/11/2017.
 */
public class Service {
    private List<Project> projects;
    private List<Currency> currencies;
    private List<Sector> sectors;
    private List<SubSector> subSectors;

    public List<Project> getProjects() {
        if(projects == null) {
            projects = new ArrayList<>(Database.getProjects());
        }
        return projects;
    }

    public List<Currency> getCurrencies() {
        if(currencies == null) {
            currencies = new ArrayList<>(Database.getCurrencies());
        }
        return currencies;
    }

    public List<Sector> getSectors() {
        if(sectors == null) {
            sectors = new ArrayList<>(Database.getSectors());
        }
        return sectors;
    }

    public List<SubSector> getSubSectors() {
        if(subSectors == null) {
            subSectors = new ArrayList<>(Database.getSubSectors());
        }
        return subSectors;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }

    public void setSubSectors(List<SubSector> subSectors) {
        this.subSectors = subSectors;
    }
}
