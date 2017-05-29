package com.javainuse.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.javainuse.dao.Fkdao;
import com.javainuse.domain.Request;

public class FkserviceImpl implements FkService {

	Fkdao fkdao;

	public Fkdao getFkdao() {
		return fkdao;
	}

	public void setFkdao(Fkdao fkdao) {
		this.fkdao = fkdao;
	}

	@Override
	public String processdata(Request as_fk_data) {
		return fkdao.processdata(as_fk_data);
	}

}
