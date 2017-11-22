package com.lovecws.mumu.excel;

import com.lovecws.mumu.excel.beans.ExcelParserBean;
import com.lovecws.mumu.excel.parser.ExcelParser;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class XLSExcelParserTest {

	@Test
	public void parser(){
		ExcelParser parser=new ExcelParser();
		try {
			ExcelParserBean excelParserBean = parser.parser(XLSExcelParserTest.class.getResource("/").getPath() + "xls.xls");
			//System.out.println(excelParserBean);
			for (List<Object> list : excelParserBean.getData()) {
				for (Object object : list) {
					System.out.print(object + "\t");
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test(){

	}
}
