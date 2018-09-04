package batch_adress;

import java.sql.SQLException;
import java.util.List;

public interface AddrListDAO {

	public List<AddrListInfo> selectAddrList(AddrListInfo ai)throws SQLException;
	public AddrListInfo selectAdd(AddrListInfo ai)throws SQLException;
	public int insertList(List<List<String>> list);
	/*public int deleteList(AddrListInfo ai)throws SQLException;
	public int updateList(AddrListInfo ai)throws SQLException;
*/
}
