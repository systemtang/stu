package com.smartlab.drivetrain.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 根据传入JSON数据生成excel
 * 表头已定死,需要另一个工具类ExcelFileGenerator.java
 * @author trj
 *
 */
@WebServlet("/file/excel")
public class ExportExcel extends HttpServlet {


    
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");  

		String tempmenberinfo = request.getParameter("hidden_for_menberinfo");
		
		String acceptjson = ""; 
	    
//	  BufferedReader br = new BufferedReader(new InputStreamReader( (ServletInputStream) request.getInputStream(), "utf-8"));  
//      StringBuffer sb = new StringBuffer("");  
//      String temp;  
//      while ((temp = br.readLine()) != null) {  
//          sb.append(temp);  
//      }  
//      br.close();  
//      acceptjson = sb.toString();
	    acceptjson = tempmenberinfo;
      if (acceptjson != "") {  
          JSONObject jsondata = JSONObject.parseObject(acceptjson);  
          JSONArray rows = jsondata.getJSONArray("rows");  
          ArrayList dataList = new ArrayList();
          
          for (int i = 0; i < rows.size(); i++) {
        	 JSONObject tempjson = (JSONObject) rows.get(i);
        	 ArrayList templist = new ArrayList(); 
        	 
        	String phone = tempjson.getString("phone");
        	templist.add(phone);
        	
        	String realname = tempjson.getString("realname");
        	templist.add(realname);
        	
        	String regtime = tempjson.getString("regtime");
        	templist.add(regtime);
        	
        	String school = tempjson.getString("school");
        	templist.add(school);
        	
        	String partner = tempjson.getString("partner");
        	templist.add(partner);
        	
        	dataList.add(templist);
          }
	    //初始化fieldName，fieldDate
	    ArrayList fieldName=getFieldName();    //excel标题数据集
	    ArrayList fieldData=dataList;    //excel数据内容
	  String myexcel="menber_info";
//	  myexcel = Util.encodeFilename(myexcel, request);   
	    response.reset();
	    response.setContentType("application/vnd.ms-excel;charset=utf-8");   
	    response.setHeader("Content-Disposition", "attachment;filename=" + myexcel);
	    response.setCharacterEncoding("utf-8");    
//	    OutputStream ouputStream = response.getOutputStream();   

//	    //回去输出流
	  ServletOutputStream out=response.getOutputStream();
//	    //重置输出流
//	    //设置导出Excel报表的导出形式
	    response.setContentType("application/vnd.ms-excel");
	    response.setHeader("Content-Disposition","attachment;filename="+myexcel+".xls");
	    ExcelFileGenerator efg=new ExcelFileGenerator(fieldName, fieldData);
	    
	    try {
	    	HSSFWorkbook mybook = efg.expordExcel();

	    	mybook.write(out);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	      ouputStream.flush();   
//	      ouputStream.close();   
	    //设置输出形式
	    System.setOut(new PrintStream(out));
	    //刷新输出流
	    out.flush();
	    //关闭输出流
	    if(out!=null){
	      out.close();
	    }
    }        
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
       this.doGet(request, response);
  }

//  //模拟提供excel中的标题数据集
  public ArrayList getFieldName(){
    String str[]={"编号","会员电话","会员名","注册时间","所属驾校","推荐人"};
    ArrayList list=new ArrayList();
    for(int i=0;i<str.length;i++){
      list.add(str[i]);
    }
    return list;
  }

}