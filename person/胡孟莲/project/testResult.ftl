<html>
<head>
  <title>���Ա���</title>
</head>
<body>
  <h1>���Ա���</h1>
  <p>���ɲ��Ա����ʱ�䣺${.now?string["yyyy-MM-dd  hh:mm:ss"]}</p>
  <p>��������${casesize}����������</p>
  <p>ʧ����${failedList}����������,�ɹ���${passedList}����������</p>

 <#if failed?size gt 0>
<p>ִ��ʧ�ܵĲ�������</p>
<table border='1'>
 <tr bgcolor='orange'>
 <td>���</td>
 <td>����</td>
 <td>method</td>
 <td>casetitle</td>
 <td>���Խ���</td>
 </tr>
<#list failed as case>
    <tr bgcolor='red'>
        <td>${case_index+1}</td>
        <td>${case.name}</td>
        <td>${case.method}</td>
        <td>${case.getAttribute("name")}</td>
        <td>FAIL</td>
    </tr>
</#list>
</table>
 </#if>

 <#if pass?size gt 0>
<p>ִ�гɹ��Ĳ�������</p>
<table border='1'>
 <tr bgcolor='orange'>
 <td>���</td>
 <td>����</td>
 <td>method</td>
 <td>casetitle</td>
 <td>���Խ���</td>
 </tr>
<#list pass as case>
    <tr bgcolor='green'>
        <td>${case_index+1}</td>
        <td>${case.name}</td>
        <td>${case.method}</td>
        <td>${case.getAttribute("name")}</td>
        <td>PASS</td>
    </tr>
</#list>
</table>
 </#if>
  
</body>
</html>