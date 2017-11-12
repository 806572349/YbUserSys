package com.yb.base.util;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * ttf字体文件
 * @author dsna
 *
 */
public class ImgFontByte {
	static StringBuffer sb = new StringBuffer();
	
	public static Font getFont(int fontHeight){
		try {
			Font baseFont = Font.createFont(Font.TRUETYPE_FONT, new ByteArrayInputStream(hex2byte(getFontByteStr())));
			return baseFont.deriveFont(Font.PLAIN, fontHeight);
		} catch (Exception e) {
			return new Font("Arial",Font.PLAIN, fontHeight);
		}
	}
	
	private static byte[] hex2byte(String str) { 
		if (str == null)
			return null;
		str = str.trim();
		int len = str.length();
		if (len == 0 || len % 2 == 1)
			return null;

		byte[] b = new byte[len / 2];
		try {
			for (int i = 0; i < str.length(); i += 2) {
				b[i / 2] = (byte) Integer
						.decode("0x" + str.substring(i, i + 2)).intValue();
			}
			return b;
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * ttf字体文件的十六进制字符串
	 * @return
	 */
	private static String getFontByteStr(){
		if(sb.length() > 0)
			return sb.toString();
		Lock lock = new ReentrantLock();
		lock.lock();
		try{
			if(sb.length() > 0)
				return sb.toString();
			InputStream in = ClassLoader.getSystemResourceAsStream("font.file");
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(in));
			String tempString = bufferReader.readLine();  
			sb = new StringBuffer(tempString);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		return sb.toString();
	}
}