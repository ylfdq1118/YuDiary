package Segment;

import java.util.Date;
import java.io.Serializable;

import javax.swing.text.StyledDocument;

@SuppressWarnings("serial")
public class Diary_Segment implements Serializable{

	//�ռǴ�������
	public Date date = new Date();
	//�ռ�����
	public String author;
	//�ռǵ�������
	public int zan_number;
	//�ռǱ���
	public String title;
	//�ռ����ݣ��Ժ���Ҫ�޸�
	public String text;
	
	//public StyledDocument doc;
	
	//�����־
	public boolean public_flag;
	public int icon;
}
