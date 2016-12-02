package com.common.service;

import com.common.value.WebSite;
import java.util.*;
import com.common.service.CommonManager;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Thu Dec 12 16:17:33 CST 2013
*/

public interface WebSiteManager extends CommonManager 
{
    public abstract void saveWebSite(WebSite val);

    public abstract void removeWebSite(WebSite val);

    public abstract void removeWebSite(Long id);

    public abstract WebSite getWebSiteById(Long id);

    public abstract List<WebSite> getWebSiteList();
    public abstract Long[] getIdsFromFunctionCategoryList(List<FunctionCategory> lst);

    public abstract List<FunctionCategory> getFunctionCategoryListByIds(Long[] ids);

}

