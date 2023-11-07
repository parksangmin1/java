package chapter12;

import java.io.BufferedInputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("a.txt"));
				ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			byte[] buf = new byte[1024];
			int len = 0;
			//버퍼 단위로 읽음
			while((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			byte[] arr = out.toByteArray();
			String s = new String(arr);
			System.out.println(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
