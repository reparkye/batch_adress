package batch_adress;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddrListDAOImpl implements AddrListDAO {

	
	@Override
	public List<AddrListInfo> selectAddrList(AddrListInfo ai) throws SQLException {
		String sql = "select * from addr_list";
		Connection con = DBCon.getCon();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				List<AddrListInfo> aList = new ArrayList<AddrListInfo>();
				while(rs.next()) {
					AddrListInfo aai = new AddrListInfo(rs.getInt("alNum"),rs.getString("alZip")
							,rs.getString("alCity"),rs.getString("alCityEn"),rs.getString("alState")
							,rs.getString("alStateEn"),rs.getString("alVil"),rs.getString("alVilEn")
							,rs.getString("alLoadCode"),rs.getString("alLoadName"),rs.getString("alLoadNameEn")
							,rs.getString("alBuilOrg"),rs.getString("alBuilSub"));
				}
				
			}catch(SQLException e) {
				throw e;
			}
		
		return null;
	}

	@Override
	public AddrListInfo selectAdd(AddrListInfo ai) throws SQLException {
		
		return null;
	}

	@Override
	public int insertList(List<List<String>> list) {
		long s = System.currentTimeMillis();
		int rCnt = 0;
		Connection con = DBCon.getCon();
		PreparedStatement ps = null;
		String sql = "insert into addr_list values(seq_alnum.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			for(int j=0; j<list.size(); j++) {
				List<String> strList = list.get(j);
				for(int i=0;i<strList.size();i++) {
					ps.setString(i+1, strList.get(i));
				}
				ps.addBatch();
				ps.clearParameters();
				if(j+1%1000==0 || j+1==list.size()) {
					rCnt += ps.executeBatch().length;
				}
			}
			DBCon.getCon();
		}catch(SQLException e) {
			DBCon.getCon();
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		System.out.println();
	}

}
