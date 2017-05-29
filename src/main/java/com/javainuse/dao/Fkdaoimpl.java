package com.javainuse.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.javainuse.domain.Request;
import com.javainuse.domain.Response;

import java.sql.*;  

public class Fkdaoimpl implements Fkdao {

	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public String processdata(Request as_fk_data) {
		
		String sql = "select bulk_upload_awb_for_fk(?);";
		
		String resp = null;
		
		//return "fd dsf";
		//return template.queryForObject(sql, new Object[] { as_fk_data.getInData() }, new BeanPropertyRowMapper<String>(String.class));
		
		CallableStatement upperProc;
		try {
			upperProc = template.getDataSource().getConnection().prepareCall("{CALL bulk_upload_awb_for_fk(?)}");
			
			upperProc.setString(1, as_fk_data.getInData());
			
			upperProc.registerOutParameter(1, Types.OTHER);
			
			upperProc.execute();
			
			resp = upperProc.getObject(1).toString();
			upperProc.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resp;
		
	}

}
