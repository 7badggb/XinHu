<html>
<head>
  <title>���Ա���</title>
</head>
<body>
  <h1>���Ա���</h1>
  <p>���ɲ��Ա����ʱ�䣺${.now?string["yyyy-MM-dd  hh:mm:ss"]}</p>
  <p>��������${casesize}����������</p>
  <p>ʧ����${failedList}����������,�ɹ���${passedList}����������</p>

<table border='1'>
<tr bgcolor='red'>
 <td>����caseִ��ʧ��</td><td></td><td></td><td></td>
</tr>
 <tr bgcolor='orange'>
  <td>���</td><td>����</td><td>method</td><td>���Խ���</td>
 </tr>
<#list failed as case>
    <tr bgcolor='white'>
        <td>${case_index+1}</td><td>${case.name}</td><td>${case.method}</td><td>fail</td>
    </tr>
</#list>
<tr bgcolor='green'>
<td>����caseִ�гɹ�</td><td></td><td></td><td></td>
</tr>
 <tr bgcolor='SkyBlue'>
 <td>���</td><td>����</td><td>method</td><td>���Խ���</td>
 </tr>
<#list pass as case>
    <tr bgcolor='white'>
        <td>${case_index+1}</td><td>${case.name}</td><td>${case.method}</td><td>pass</td>
    </tr>
</#list>
</table>
  
</body>
</html>