package com.Test1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

/*
 *   �Ѳ�ɫ��Ƭת���ɺڰ���Ƭ�� java����
         �ӿ���̨������Ƭ��·����Ȼ�����ת�������Ƭ�ļ���ԭ��Ƭ���ڵ�·����
 *   
 * 
 */
public class Test {

	public static void main(String[] args) {
//   ��������¼�����
		Scanner sc = new Scanner(System.in);
//		����������ļ���ַ
//		String imgPath = "C:\\Java-practice\\001.jpg";
		String imgPath = sc.nextLine();
		
		try{
			
			BufferedImage image =  ImageIO.read(new FileInputStream(imgPath));
		    
			
			int width = image.getWidth();
			int height = image.getHeight();
//			�Ҷ�ͼֱ�۵ؽ����ǽ�ԭ����RGBͼ��ת��Ϊֻ�лҶȼ���ͼ��ֻҪ��ÿ�����ص��RGBֵ�ó�����
//			��һ�����ǵ�ƽ��ֵ(R+G+B)/3��Ȼ�����滻ԭ����RGBֵ	
//			���б�������ת��ͼƬ
			for(int j=0 ; j<height; j++){
				for(int i=0; i<width; i++){
					int p = image.getRGB(i, j);
					
					int a = (p >> 24) & 0xff;
					int r = (p >> 16) & 0xff;
					int g = (p >> 8) & 0xff;
					int b = p & 0xff;
					
					int average = (r + g + b) / 3;
					
					p = (a << 24) | (average << 16) | (average << 8) | average;
					
					image.setRGB(i, j, p);
					
				}
			}
//		���������ļ�
			File outputfile = new File("C:\\Java-practice\\Out.jpg");
		    ImageIO.write(image, "jpg", outputfile);
		    
		}catch (IOException e) {
			System.out.println(e);
			
		}
		


	}

}