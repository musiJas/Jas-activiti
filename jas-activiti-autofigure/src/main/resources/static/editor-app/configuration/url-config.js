/*
 * Activiti Modeler component part of the Activiti project
 * Copyright 2005-2014 Alfresco Software, Ltd. All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
var KISBPM = KISBPM || {};

KISBPM.URL = {
    getModel: function (modelId) {
        console.log("info..."+ACTIVITI.CONFIG.getContextPath());
        return  ACTIVITI.CONFIG.getContextPath() + '/model/' + modelId + '/json';
    },
    getStencilSet: function () {
        console.log("info..."+ACTIVITI.CONFIG.getContextPath());
        return  ACTIVITI.CONFIG.getContextPath() + '/editor/stencilset?version=' + Date.now();
    },
    putModel: function (modelId) {
        console.log("info..."+ACTIVITI.CONFIG.getContextPath());
        return  ACTIVITI.CONFIG.getContextPath() + '/model/' + modelId + '/save';
    },
    getContextPath: function () {
         let  url=window.location.href;
         url= url.replace("http://",'').replace("https://",'');
         url=url.substring(url.indexOf('/')+1,url.length);
         let  contextPath=url.substring(0,url.indexOf('/'));
         console.info(' contextPath '+contextPath);
         return  "/"+contextPath;
    }
};