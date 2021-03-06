
package com.base.dao;

import java.util.List;

import com.base.value.AppProperty;
import com.base.value.MiscCode;
import com.base.value.SessionUser;
import com.base.value.UploadedFile;
import com.base.value.Function;

public interface BaseDAO
{
    public abstract List findCountryList();
    public abstract List findCountyList();
    public abstract List findCityList(String county);
    public abstract List findAppPropertyList(String kind);
    public abstract List getDevicePropertyList(String kind,String devicename);
    public abstract MiscCode findMiscCodeById(Long id);
    public abstract AppProperty findAppPropertyById(Long id);
    public abstract List findMiscCodeListByCodeName(String codeName);
    public abstract MiscCode findMiscCodeByCodeKeyName(String codeName, String keyName);
    public abstract UploadedFile findUploadedFileById(Long id);
    public abstract void removeUploadedFile(UploadedFile val);
    public abstract void removeUploadedFile(Long id);
    public abstract SessionUser findSessionUserByLoginIdAndPassword(String uid, String pwd);
    public abstract Function findFunctionById(Long id);
    public abstract Function findFunctionByKey(String key);
    public abstract List findAllGroup();
    public abstract List findFunctionListBySessionUser(SessionUser su);
} 