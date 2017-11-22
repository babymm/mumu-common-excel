package com.lovecws.mumu.excel;

import com.lovecws.mumu.excel.beans.ExcelGeneraterBean;
import com.lovecws.mumu.excel.generater.ExcelGenerater;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
public class XLSXExcelGenerateTest {

    @Test
    public void test() {
        ExcelGenerater excelGenerater = new ExcelGenerater();
        List<String> exportHeaderNames = new ArrayList<String>();
        exportHeaderNames.add("预约用户");
        exportHeaderNames.add("预约电话");
        exportHeaderNames.add("预约IP");
        exportHeaderNames.add("预约产品");
        exportHeaderNames.add("预约时间");
        exportHeaderNames.add("预约信息描述");

        List<List<Object>> exportData = new ArrayList<List<Object>>();
        for (int i=0;i<10000;i++){
            List<Object> data = new ArrayList<Object>();
            data.add("用户"+i);
            data.add("电话18971"+i);
            data.add("预约IP"+i);
            data.add("预约产品"+i);
            data.add("预约时间"+new Date().toLocaleString());
            data.add("预约信息描述"+i);
            exportData.add(data);
        }
        ExcelGeneraterBean excelGeneraterBean = excelGenerater.create("测试", exportHeaderNames, exportData, 10000, XLSXExcelGenerateTest.class.getResource("/").getPath() + "xlsx.xlsx");
    }
}
