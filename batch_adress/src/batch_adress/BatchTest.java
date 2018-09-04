package batch_adress;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchTest {

	public static void main(String[] args){
		//String path = "C:\\jsp_study\\zipcode_DB";
		String path = "D:\\java_study\\zipcode_DB";
				
		File f = new File(path);
		System.out.println("폴더유뮤 :" + f.isDirectory());
		System.out.println("대상폴더유뮤 :" + f.exists());
		File[] fList = f.listFiles();
		List<List<String>> list = new ArrayList<List<String>>();
		try {
		for(File ff : fList) {
			if(ff.getName().endsWith("세종특별자치시.txt")) {
				list = new ArrayList<List<String>>();
				FileInputStream fis = new FileInputStream(ff);
				InputStreamReader fr = new InputStreamReader(fis,"euc-kr");
				BufferedReader br = new BufferedReader(fr);
				String line;
				br.readLine();
				while((line=br.readLine())!=null) {
					String[] strs = line.split("\\|");
					List<String> strList = new ArrayList<String>();
					for(int i=0, max=9;i<=max;i++) {
						strList.add(strs[i]);
					}
					strList.add(strs[11]);
					strList.add(strs[12]);
					list.add(strList);
					}
				br.close();
				fr.close();
				
				AddrListDAO aldao = new AddrListDAOImpl();
				System.out.print(ff.getName() + "파일");
				int totalInserCnt = aldao.insertList(list);
				
				System.out.println("입력한 갯수 :" + list.size());
				System.out.println("입력된 갯수:" + totalInserCnt);
				
				System.out.println("exit");
			}
		}
	}catch(IOException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}

	
