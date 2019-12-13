package core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.edu.utils.ReadPro;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class ApiListener extends TestListenerAdapter{


   
	@Override
	public void onFinish(ITestContext testContext) {
	
		super.onFinish(testContext);	
		//freemarker
		
				// step1 ����freeMarker����ʵ��
		        Configuration configuration = new Configuration(Configuration.VERSION_2_3_22);
		        Writer out = null;
		        try {
		        	 String templatePath =ReadPro.getPropValue("templatePath");
		            // step2 ��ȡģ��·��
		            configuration.setDirectoryForTemplateLoading(new File(templatePath));
		            // step3 ��������ģ��
		            Map context=new HashMap();
		            
		            ITestNGMethod method[]=this.getAllTestMethods();
		    		List failedList=this.getFailedTests();
		    		List passedList=this.getPassedTests();
		    		List failedList1=new ArrayList();
		    		List passedList1=new ArrayList();		
		    		for(int j=0;j<failedList.size();j++)
		    		{
		    			
		    			ITestResult tr=(ITestResult) failedList.get(j);
		    			if(tr.getMethod().getDescription()!=null)
		    			{
		    				tr.setAttribute("name", tr.getMethod().getDescription());
		    			}
		    			else
		    			{
		    				tr.setAttribute("name", "");
		    			}
		    		
		    			failedList1.add(tr);
		    		}
		    		for(int j=0;j<passedList.size();j++)
		    		{
		    			ITestResult tr=(ITestResult) passedList.get(j);
		    			if(tr.getMethod().getDescription()!=null)
		    			{
		    				tr.setAttribute("name", tr.getMethod().getDescription());
		    			}
		    			else
		    			{
		    				tr.setAttribute("name", "");
		    			}		    		
		    			passedList1.add(tr);
		    		}		            
		            context.put("failedList",failedList.size());   
		            context.put("passedList",passedList1.size()); 
		            context.put("casesize",passedList.size()+failedList.size()); 
		            context.put("failed", failedList);
		            context.put("pass", passedList1);		          
		            // step4 ����ģ���ļ�
		            Template template = configuration.getTemplate("testResult.ftl");
		            // step5 ��������
		            String result=ReadPro.getPropValue("result");
		            File docFile = new File(result + "\\" + "testResult.html");
		            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
		            // step6 ����ļ�
		            template.process(context, out);
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                if (null != out) {
		                    out.flush();
		                }
		            } catch (Exception e2) {
		                e2.printStackTrace();
		            }
		       }
		        try {
					MailUtils.sendMail1();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

	   public String getTime()
	    {
	    	java.util.Calendar c=java.util.Calendar.getInstance();    
	        java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");    
	       	return  f.format(c.getTime());    
	    }


}
