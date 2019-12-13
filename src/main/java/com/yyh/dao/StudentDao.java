package com.yyh.dao;

import com.yyh.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-12-13-10:13
 */
@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    RowMapper<Student> rowMapper = new RowMapper<Student>() {
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student(rs.getInt(1), rs.getString(2));
            return student;
        }
    };

    public List<Student> selectAll() {
        return jdbcTemplate.query("select * from Student", rowMapper);
    }


}
