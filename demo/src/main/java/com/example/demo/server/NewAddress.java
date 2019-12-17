package com.example.demo.server;

@RestController
public class NewAddress {

	public static Cookie cookie;
	@ResponseBody
	@RequestMapping(value="/fgadmin/address/new",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public JSONObject getByJSON(HttpServletResponse response,@RequestBody JSONObject body) {
		String receiverName=body.getString("receiverName");
		Object cellPhone=body.get("cellPhone");
		String addressDetail=body.getString("addressDetail");
		String province=body.getString("province");
		String city=body.getString("city");
		String area=body.getString("area");
		
		JSONObject result=new JSONObject();
		if(receiverName==null) {
			result.element("message","receiverName�������Ͳ���ȷ");
			result.element("code", 400);	
		}else if(receiverName.equals("����")&&cellPhone.equals("12615813537")&&addressDetail.equals("1��3��Ԫ")
				&&province.equals("�㽭ʡ")&&city.equals("������")&&area.equals("������")) {
			result.element("message","success");
			result.element("code", 200);
		} else {
			result.element("message","�����������ȷ");
			result.element("code",400);
		}
		return result;
	}
}
