package com.spring.bbsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.spring.bbsVO.BVO;
import com.spring.template.StaticTemplate;

public class BDAO {

	JdbcTemplate template;

	public BDAO() {
		this.template = StaticTemplate.template;
	}

	
	public ArrayList<BVO> list() {

		ArrayList<BVO> bVOs = null;
		String sql = "select bNo, bName, bSubject, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_bbs"
				+ " order by bGroup desc, bStep asc";

		RowMapper<BVO> rm = new BeanPropertyRowMapper<BVO>(BVO.class);
		bVOs = (ArrayList<BVO>) template.query(sql, rm);
		return bVOs;
	}// list()

	
	public void write(final String bName, final String bSubject, final String bContent) {

		String sql = "insert into mvc_bbs(bNo, bName, bSubject, bContent, bHit, bGroup, bStep, bIndent) "
				+ "values(seq_bbs.nextval,?,?,?,0,seq_bbs.currval,0,0)";

		this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setString(1, bName);
				preparedStatement.setString(2, bSubject);
				preparedStatement.setString(3, bContent);
			}
		});
	}// write()

	
	public BVO contentView(String bbsNo) {

		addHit(bbsNo);

		String sql = "select * from mvc_bbs where bNo =" + bbsNo;

		RowMapper<BVO> rm = new BeanPropertyRowMapper<BVO>(BVO.class);
		return this.template.queryForObject(sql, rm);
	}// contentView()

	
	public void modify(final String bNo, final String bName, final String bSubject, final String bContent) {

		String sql = "update mvc_bbs set bName = ?, bSubject=?, bContent=? where bNo = ?";

		this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setString(1, bName);
				preparedStatement.setString(2, bSubject);
				preparedStatement.setString(3, bContent);
				preparedStatement.setString(4, bNo);
			}
		});
	}// modify()

	
	public void delete(final String bNo) {
		String sql = "delete from mvc_bbs where bNo = ?";

		this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bNo);
			}
		});
	}// delete()

	
	public BVO replyForm(String bbsNo) {

		String sql = "select * from mvc_bbs where bNo =" + bbsNo;
		return this.template.queryForObject(sql, new BeanPropertyRowMapper<BVO>(BVO.class));
	}// replyForm()

	
	public void replyOk(String bNo, final String bName, final String bSubject, final String bContent,
			final String bGroup, final String bStep, final String bIndent) {
		replySet(bGroup, bStep);

		String sql = "insert into mvc_bbs (bNo, bName, bSubject, bContent, bGroup, bStep, bIndent)"
				+ " values(seq_bbs.nextVal,?,?,?,?,?,?)";

		this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bName);
				ps.setString(2, bSubject);
				ps.setString(3, bContent);
				ps.setInt(4, Integer.parseInt(bGroup));
				ps.setInt(5, Integer.parseInt(bStep) + 1);
				ps.setInt(6, Integer.parseInt(bIndent) + 1);
			}
		});
	}// replyOk()

	
	public void replySet(final String group, final String step) {

		String sql = "update mvc_bbs set bStep = bStep+1 where bGroup=? and bStep>?";

		this.template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setString(1, group);
				preparedStatement.setString(2, step);
			}
		});
	}// replySet()

	
	private void addHit(final String bNo) {
		String sql = "update mvc_bbs set bHit = bHit + 1 where bNo = ?";

		this.template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setInt(1, Integer.parseInt(bNo));
			}
		});
	}// addHit()
}
