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
			result.element("message","receiverName参数类型不正确");
			result.element("code", 400);	
		}else if(receiverName.equals("张三")&&cellPhone.equals("12615813537")&&addressDetail.equals("1栋3单元")
				&&province.equals("浙江省")&&city.equals("杭州市")&&area.equals("滨江区")) {
			result.element("message","success");
			result.element("code", 200);
		} else {
			result.element("message","请求参数不正确");
			result.element("code",400);
		}
		return result;
	}
}
