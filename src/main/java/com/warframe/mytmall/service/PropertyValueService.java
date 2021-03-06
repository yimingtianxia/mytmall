package com.warframe.mytmall.service;


import com.warframe.mytmall.pojo.PropertyValue;

import java.util.List;

/**
 * Created by warframe on 2017/6/3.
 */
public interface PropertyValueService {

    PropertyValue getPropertyValueById(int id);

    void addPropertyValue(PropertyValue propertyValue);

    int getTotalNumber();

    List<PropertyValue> getProperties();

    void deletePropertyValue(int id);

    void updatePropertyValue(PropertyValue propertyValue);

    List<PropertyValue> list(int start, int count);


}
