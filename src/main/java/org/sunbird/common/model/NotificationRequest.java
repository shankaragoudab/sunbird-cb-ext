package org.sunbird.common.model;

import java.util.List;
import java.util.Map;

public class NotificationRequest {
    private String mode;
    private String deliveryType;
    private Config config;
    private List<String> ids;
    private Template template;
    private Map rawData;
    private List<String> copyEmail;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Object getRawData() {
        return rawData;
    }

    public void setRawData(Map rawData) {
        this.rawData = rawData;
    }

    public List<String> getCopyEmail() {
        return copyEmail;
    }

    public void setCopyEmail(List<String> copyEmail) {
        this.copyEmail = copyEmail;
    }
}