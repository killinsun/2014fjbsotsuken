package jp.ac.fjb.onsen.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.jsp.tagext.TryCatchFinally;

import jp.ac.fjb.onsen.bean.OnsenYoyakuBean;
import jp.ac.fjb.onsen.util.DBManager;

public class OYoyakuModel {


	//�����̏h���l���̎擾
	public ArrayList<Integer> getAkiHeya(String onsenNo, String year, String month){

		ArrayList<Integer> cList = new ArrayList<Integer>();

		// SQL����g�ݗ��Ă�
		String sql = "select ���t,�󂫕����� from �\��󋵕\ where ����ԍ� = '"+ onsenNo +"' and ���t like '"+ year +"/"+ month +"/%' order by TO_DATE(���t, 'YYYY/MM/DD') asc";
		System.out.println(sql);

		// DB�A�N�Z�X���i�̐���
		DBManager dm = new DBManager();

		try {
			// DB�̃I�[�v��
			dm.openDB();

			// SELECT���̎��s
			ResultSet rs = dm.selectSQL(sql);


			// �f�[�^���擾�ł��Ȃ�������null��Ԃ�
			if ( !rs.next() ) {
				return null;
			}

			// �擾�������[�U����DAO�ɋl�߂ăZ�b�V�����Ɋi�[
			boolean flg = true;
			while(flg==true){
				cList.add(rs.getInt("�󂫕�����"));

				flg = rs.next();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// �f�[�^�x�[�X�̃N���[�X
			dm.closeDB();
		}
		return cList;
	}
}