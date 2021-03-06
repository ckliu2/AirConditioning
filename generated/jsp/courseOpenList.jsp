<%@ include file="/common/taglibs.jsp"%>

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key="courseOpen.list"/></td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editCourseOpen.html'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
            &nbsp;&nbsp;&nbsp;&nbsp;<button onclick="myCheckSubmitCopy('form1', <ww:property value="courseOpenList.size()"/>, 'selectedCourseOpenId', 'copyCourseOpen.html', '<fmt:message key="common.mustSelectOne"/>', '<fmt:message key="common.mustSelectOnlyOne"/>')" class="cButton"><fmt:message key="common.copy"/></button>
        </ww:if>
        <ww:else>
            <button onclick="location.href='editCourseOpen.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="courseOpenList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    <display:column titleKey="common.select">
        <input type="checkbox" id="selectedCourseOpenId_<c:out value="${count}"/>" name="selectedCourseOpenId" value="<c:out value="${row.id}"/>">
    </display:column>
    <display:column property="week" sortable="true" titleKey="courseOpen.week" />
    <display:column property="startTime" sortable="true" titleKey="courseOpen.startTime" style="text-align:left" />
    <display:column property="endTime" sortable="true" titleKey="courseOpen.endTime" style="text-align:left" />
    <display:column property="active" sortable="true" titleKey="courseOpen.active" style="text-align:left" />
    <display:column property="node" sortable="true" titleKey="courseOpen.node" />
    <display:column property="reservation" sortable="true" titleKey="courseOpen.reservation" style="text-align:left" />
    <display:column property="course.caption_" sortable="true" titleKey="courseOpen.course" style="text-align:left"/>
    <display:column property="teacher.caption_" sortable="true" titleKey="courseOpen.teacher" style="text-align:left"/>
    <display:column property="classroom.caption_" sortable="true" titleKey="courseOpen.classroom" style="text-align:left"/>
    <display:column titleKey="common.action">
        <ww:if test="recordEditable == true">
            <a href="editCourseOpen.html?courseOpen.id=<c:out value="${row.id}"/>"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
            <a href="#" onClick="javascript:return myConfirm('<fmt:message key="common.confirmDelete1"/><c:out value="${row.caption_}" /><fmt:message key="common.confirmDelete2"/>', 'form1', 'courseOpen.id', '${row.id}')"><fmt:message key="common.delete"/></a>
        </ww:if>
        <ww:else>
           <a href="editCourseOpen.html?courseOpen.id=<c:out value="${row.id}"/>"><fmt:message key="common.view"/></a>&nbsp;&nbsp;
        </ww:else>
    </display:column>
    <c:set var="count" value="${count+1}" />
</display:table>
        </td>
    </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editCourseOpen.html'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
            &nbsp;&nbsp;&nbsp;&nbsp;<button onclick="myCheckSubmitCopy('form1', <ww:property value="courseOpenList.size()"/>, 'selectedCourseOpenId', 'copyCourseOpen.html', '<fmt:message key="common.mustSelectOne"/>', '<fmt:message key="common.mustSelectOnlyOne"/>')" class="cButton"><fmt:message key="common.copy"/></button>
        </ww:if>
        <ww:else>
            <button onclick="location.href='editCourseOpen.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
</table>
<form name="form1" action="saveCourseOpen.html">
    <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="courseOpen.id" value="">
    <select name="selectedCourseOpenIds" multiple="true" style="display:none"></select>
</form>
