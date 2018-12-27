package com.gx.hz.service.impl;

import com.gx.hz.service.SystemParameterManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by ten on 17/11/24.
 */
@Service("systemParameterManager")
@Transactional
public class SystemParameterManagerImpl implements SystemParameterManager {




    private String propertyFileName;
    private ResourceBundle resourceBundle;

    private String getSystemParameterByKey(String key) {
        propertyFileName = "type";
        resourceBundle = ResourceBundle.getBundle(propertyFileName);

        if (key == null || key.equals("") || key.equals("null")) {
            return "";
        }
        String result = "";
        try {
            result = resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            e.printStackTrace();

        }
        return result;
    }

    @Override
    public String getTypeParameter(String key) {
        return getSystemParameterByKey(key);
    }
}
