package test;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.testng.annotations.Test;

import utils.Common;

import core.HttpDriver;
import net.sf.json.JSONObject;
import utils.Checker;
//�ֽ�
public class SkuListTestYanJie {
	String skuList_url="/common/skulist";
	String skulistByid_url="/common/skulistbyid";
	@Test(description="��ȡskulist")
	public void testSkuList() throws IOException, Exception {
		String result=HttpDriver.doGet(skuList_url);
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(description="��ȡskulist����ȷ�Ĳ���id")
	public void testSkuListByid1() throws IOException, Exception {
		String result=HttpDriver.doGet(skulistByid_url,"goodsId=1");
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(description="��ȡskulist������Ĳ���id")
	public void testSkuListByid2() throws IOException, Exception {
		String result=HttpDriver.doGet(skulistByid_url,"goodsId=2");
		Checker check=new Checker(result);
		try {
			check.assertXpath("message", "��ƷID������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
