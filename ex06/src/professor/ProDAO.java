package professor;
import java.util.*;
import java.sql.*;

public class ProDAO {
	Connection con=Database.CON;
	
	//정보수정
	public void update(ProVO vo) {
		try {
			String sql="update professors set pname=?,dept=?,title=?,salary=?, hiredate=sysdate where pcode=?";
					PreparedStatement ps =con.prepareStatement(sql);
					ps.setString(1,vo.getPname());
					ps.setString(2, vo.getDept());
					
					//ps.setString(3, vo.getHiredate());
					ps.setString(3,vo.getTitle());
					ps.setInt(4, vo.getSalary());
					ps.setString(5, vo.getPcode());
					 ps.execute();

		}catch(Exception e) {
			System.out.println("교수수정"+e.toString());
		}
	}
	
	//교수삭제
	public void delete(String pcode) {
		try {
			String sql="delete from professors where pcode=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,pcode);
			ps.execute();
		}catch(Exception e) {
			System.out.println("교수삭제"+e.toString());
		}
	}
	
	//교수조회
	public ProVO read(String pcode) {
		ProVO vo = new ProVO();
		try {
			String sql="select * from professors where pcode=?";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1,pcode);
			ResultSet rs=ps.executeQuery(); //결과를 받을떄만 executeQuery()
			if(rs.next()) {
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getNString("pname"));
				vo.setDept(rs.getString("dept"));
				vo.setHiredate(rs.getNString("hiredate"));
				vo.setTitle(rs.getString("title"));
				vo.setSalary(rs.getInt("salary"));
			}
		}catch(Exception e) {
			System.out.println("교수조회"+e.toString());
		}
		return vo;
	}
	
	//새로운코드
	public int getcode() {
		int code=0;
		try {
			String sql="select max(pcode)+1 as code from professors";
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				code=rs.getInt("code"); //따옴표
			}
		}catch(Exception e) {
			System.out.println("새로운코드"+e.toString());
		}
		return code;
	}
	
	//교수등록
	public void insert (ProVO vo) {
		try {
			String sql="insert into professors(pcode,pname,dept,hiredate,title,salary)";
				   sql+="values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,vo.getPcode());
			ps.setString(2, vo.getPname());
			ps.setNString(3, vo.getDept());
			ps.setString(4, vo.getHiredate());
			ps.setString(5, vo.getTitle());
			ps.setInt(6, vo.getSalary());
			ps.execute();
		}catch(Exception e) {
			System.out.println("교수등록"+e.toString());
		}
	}
	
	//교수목록
	public ArrayList<ProVO> list(){
		ArrayList<ProVO> array = new ArrayList<ProVO>();
		try {
			String sql="select * from professors order by pcode";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ProVO vo=new ProVO();
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getNString("pname"));
				vo.setDept(rs.getString("dept"));
				vo.setHiredate(rs.getNString("hiredate"));
				vo.setTitle(rs.getString("title"));
				vo.setSalary(rs.getInt("salary"));
				array.add(vo);
			}
		}catch(Exception e){
			System.out.println("교수목록"+e.toString());
		}
		return array;
	}
}
