<html>
<head>
  <title>���Ա���</title>
</head>
<body>
  <h1>���Ա���</h1>
  <p>���ɲ��Ա����ʱ�䣺${.now?string["yyyy-MM-dd  hh:mm:ss"]}</p>
  <p>��������${casesize}����������</p>
  <p>ʧ����${failedList}����������,�ɹ���${passedList}����������</p>

<p>ִ��ʧ�ܵĲ�������</p>
<table border='1'>
 <tr bgcolor='orange'>
 <td>����</td><td>method</td><td>״̬</td>
 </tr>
<#list failed as being>
    <tr bgcolor='red'>
        <td>${being.name}</td><td>${being.method}</td><td>${being.status}</td>
    </tr>
</#list>
</table>

<p>ִ�гɹ��Ĳ�������</p>
<table border='1'>
 <tr bgcolor='orange'>
 <td>����</td><td>method</td><td>״̬</td>
 </tr>
<#list pass as being>
    <tr bgcolor='green'>
        <td>${being.name}</td><td>${being.method}</td><td>${being.status}</td>
    </tr>
</#list>
</table>
  
</body>
</html>