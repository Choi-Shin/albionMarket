package com.api.albion.model;

import com.api.albion.LOCALIZATION;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemData {
    @JsonProperty("LocalizationNameVariable")
    private String localizationNameVariable;

    @JsonProperty("LocalizationDescriptionVariable")
    private String localizationDescriptionVariable;
    @JsonProperty("LocalizedNames")
    private LOCALIZATION localizedNames;

    @JsonProperty("LocalizedDescriptions")
    private LOCALIZATION localizedDescriptions;
    @JsonProperty("Index")
    private int index;

    @JsonProperty("UniqueName")
    private String uniqueName;

    public String getLocalizationNameVariable() {
        return localizationNameVariable;
    }

    public void setLocalizationNameVariable(String localizationNameVariable) {
        this.localizationNameVariable = localizationNameVariable;
    }

    public String getLocalizationDescriptionVariable() {
        return localizationDescriptionVariable;
    }

    public void setLocalizationDescriptionVariable(String localizationDescriptionVariable) {
        this.localizationDescriptionVariable = localizationDescriptionVariable;
    }

    public Object getLocalizedNames() {
        return localizedNames;
    }

    public void setLocalizedNames(Object localizedNames) {
        this.localizedNames = localizedNames;
    }

    public Object getLocalizedDescriptions() {
        return localizedDescriptions;
    }

    public void setLocalizedDescriptions(Object localizedDescriptions) {
        this.localizedDescriptions = localizedDescriptions;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }
}