package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class JvmReport {

public static  void generateJvmReport(String jsonpath) {
		File f = new File(System.getProperty("user.dir") + "//src/test/resources/Reports/JvmReport");
		Configuration con = new Configuration(f,"Facebook Web App");
		con.addClassifications("platform name","Windows 10");
		con.addClassifications("Browser name","Chrome");
		con.addClassifications("Browser version","91.0");
	    con.addClassifications("Sprint number","23");
		List<String> list = new ArrayList<String>();
		list.add(jsonpath);
		ReportBuilder r = new ReportBuilder(list,con);
		r.generateReports();
	}
}

